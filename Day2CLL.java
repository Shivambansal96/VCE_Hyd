public class Day2CLL {

    Node head = null;
    Node tail = null;
    int length = 0;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            head.prev = tail;
            tail.next = head;
        }
    }

    public void append(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }

    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("LL is Empty !!!");
        }

        else if (head == tail) {
            head = null;
            tail = null;
        }

        else {
            tail.next = head.next;
            // head.next.prev = tail;
            head = head.next;
            head.prev = tail;

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
            tail.next = head;
            head.prev = tail;

        }
    }

    public void printLL() {

        if (head == null) {
            System.out.println("LL is MEPTY");
        }

        else {

            Node current = head;

            while (current != tail) {
                System.out.print(current.data + " <-> ");
                current = current.next;
            }

            System.out.print(current.data + " <-> ");

            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Day2CLL LL = new Day2CLL();

        // LL.append(3);
        // LL.append(323);
        // LL.append(6);
        // LL.append(8);
        // LL.prepend(23);

        // LL.printLL();

        // LL.deleteStart();

        LL.printLL();

    }
}



