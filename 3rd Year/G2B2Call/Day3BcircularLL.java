
public class Day3BcircularLL {

    Node head;
    Node tail;
    int len = 0;

    public class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertStart(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
        len++;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
        len++;
    }

    public void printList() {
        Node current = head;

        while (current != tail) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.print(current.data + " <-> ");
        System.out.println("None");

    }

    public static void main(String[] args) {

        Day3BcircularLL cll = new Day3BcircularLL();

        cll.insertStart(30);
        cll.insertStart(20);
        // cll.insertStart(10);

        // cll.insertEnd(90);
        // cll.insertEnd(100);
        cll.printList();

    }
}
