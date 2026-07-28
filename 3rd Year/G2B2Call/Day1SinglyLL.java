
public class Day1SinglyLL {

    Node head;
    int len = 0;

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node insertStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        len++;
        return newNode;
    }

    public Node insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        len++;
        return newNode;
    }

    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else if (pos == 1) {
            this.insertStart(data);
        } else if (pos == ++len) {
            this.insertEnd(data);
        } else {
            Node current = head;
            for (int i = 0; i < pos - 2; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("LL is Empty !!!");
        } else if (head.next == null) {
            head = null;
            System.out.println("LL became Empty !!!");
        } else {
            head = head.next;
        }
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("LL is Empty !!!");
        } else if (head.next == null) {
            head = null;
            System.out.println("LL became Empty !!!");
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        // System.out.println(current.data);
        System.out.println("None");
    }

    

    public static void main(String[] args) {

        Day1SinglyLL sll = new Day1SinglyLL();
        sll.insertEnd(10);
        sll.insertEnd(20);
        sll.insertEnd(30);
        sll.insertEnd(40);
        sll.insertEnd(50);
        sll.printList();
        // System.out.println();
        sll.deleteStart();
        sll.deleteEnd();
        // sll.insertAtPos(100, 4);
        sll.printList();

    }
}
