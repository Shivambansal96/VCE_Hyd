
public class Day2DoublyLL {

    Node head;
    Node tail;
    int len = 0;

    public class Node {

        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public void appendStart(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        len++;
    }

    public void appendEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        len++;
    }

    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else if (pos == 1) {
            this.appendStart(data);
        } else if (pos == ++len) {
            this.appendEnd(data);
        } else {
            Node current = head;
            for (int i = 0; i < pos - 2; i++) {
                current = current.next;
            }
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }

    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("LL is already Empty!");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Element Deleted! List became empty!");
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("LL is already Empty!");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Element Deleted! List became empty!");
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void deleteAtPos(int pos) {

        if (head == null) {
            System.out.println("LL is already Empty!");
        } else if (pos == 1) {
            this.deleteStart();
        } else if (pos == len) {
            this.deleteEnd();
        } else {
            Node current = head;
            for (int i = 0; i < pos - 2; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            current.next.prev = current;
        }

    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }

        System.out.println("None");
    }

    public static void main(String[] args) {
        Day2DoublyLL dll = new Day2DoublyLL();

        dll.appendStart(30);
        dll.appendStart(20);
        dll.appendStart(10);
        dll.appendEnd(100);
        // dll.insertAtPos(50, 4);
        dll.printList();

        // dll.deleteStart();
        // dll.printList();
        // dll.deleteEnd();
        // dll.printList();
        dll.deleteAtPos(4);
        dll.printList();
    }

}
