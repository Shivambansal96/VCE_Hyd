public class Day1LL {
    // Singly Linked List

    // Day1LL() {
    // System.out.println("Created a Linked List !");
    // }

    Node head = null;

    public static class Node {
        int data;
        Node next = null;

        Node(int data) {
            // System.out.println("Created a Node");
            this.data = data;
        }

    }

    public void append(int data) {
        // System.out.println(data);

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }

        else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

    }

    public void prepend(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;

        }

        else {
            Node current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteStart() {

        if (head == null) {
            System.out.println("Linked List is Empty !!!");
        }

        else {
            head = head.next;
        }

    }

    public void deleteEnd() {

        if (head == null) {
            System.out.println("LL is empty!!!");
        }

        else if (head.next == null) {
            head = null;
        }

        else {
            Node current = head;

            while (current.next.next != null) {
                current = current.next;
            }

            current.next = null;

        }
    }

    public void printLL() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
        // System.out.print("Length = " + length);

    }

    public static void main(String[] args) {
        Day1LL LL = new Day1LL(); // Constructing an Object

        // LL.prepend(190);
        LL.append(99);
        // LL.insertAtPos(55, 1);
        LL.append(5);
        LL.prepend(100);
        LL.prepend(99);
        LL.printLL();
        LL.deleteEnd();
        // LL.append(27);

        LL.printLL();

    }
}