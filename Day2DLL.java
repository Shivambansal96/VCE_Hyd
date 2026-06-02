public class Day2DLL {
    // Doubly Linked List

    Node head = null;
    Node tail = null;
    int length = 0;

    class Node {
        int data;
        Node prev = null;
        Node next = null;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        length++;

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    public void append(int data) {

        Node newNode = new Node(data);

        length++;

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("LL is Empty !!!");
        }

        // else if(head == tail) {
        else if (head.next == null) {
            head = null;
            tail = null;
        }

        else {
            head = head.next;
            head.prev = null;
        }

    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("LL is Empty !!!");
        }

        else if (head == tail) {
            head = null;
            tail = null;
        }


        else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printLL() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        Day2DLL DLL = new Day2DLL();
        DLL.prepend(43);
        DLL.append(9);
        DLL.prepend(13);
        DLL.append(3);
        DLL.printLL();
        DLL.deleteStart();
        DLL.printLL();

    }
}




