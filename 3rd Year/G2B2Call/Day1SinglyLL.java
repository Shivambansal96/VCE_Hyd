
public class Day1SinglyLL {

    Node head;

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
            // return newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

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
        return newNode;
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
        sll.insertStart(40);
        sll.insertStart(50);

        sll.printList();

    }
}
