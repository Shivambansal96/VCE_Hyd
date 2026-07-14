// // // // // Circular Linked List

public class Day2LL {

    Node head;
    Node tail;
    int length;

    public class Node {

        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void insertStart(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

            tail.next = head;
            head.prev = tail;

        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            head = newNode;
            tail.next = newNode;
            // tail.next = head;

        }

    }

    public void insertEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

            tail.next = head;
            head.prev = tail;

        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
            tail.next = head;
            head.prev = newNode;
        }

    }

    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            if (head == null) {
                head = newNode;
                tail = newNode;

                tail.next = head;
                head.prev = tail;

            } else {
                newNode.next = head;
                newNode.prev = tail;
                head.prev = newNode;
                head = newNode;
                tail.next = head;

            }
        } else if (pos - 1 == length) {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;

            tail = newNode;
        } else {
            Node current = head;
            int c = 1;

            while (c != pos - 1) {
                c++;
                current = current.next;
            }

            newNode.prev = current;
            newNode.next = current.next;

            current.next = newNode;
            newNode.next.prev = newNode;

        }
    }

    public void deleteStart() {

        if (head == null && tail == null) {
            System.out.println("LL is Empty !!!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail.next = head.next;
            head.next.prev = head.prev;
            head = head.next;
        }
    }

    public void deleteEnd() {
        if (head == null && tail == null) {
            System.out.println("LL is Empty !!!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail.prev.next = head;
            tail = tail.prev;
            head.prev = tail;
        }
    }

    public void deleteAtPos(int pos) {

        if (pos == 1) {
            if (head == null) {
                System.out.println("LL is EMpty!!!");
            } else if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
        } else if (length == pos) {
            tail.prev.next = head;
            tail = tail.prev;
            head.prev = tail;

        } else {
            Node current = head;
            int c = 1;
            while (c != pos - 1) {
                c++;
                current = current.next;
            }

            current.next = current.next.next;
            current.next.next.prev = current;
        }
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void printList() {
        Node current = head;

        if (head != null) {

            // while (current.next != head) {
            while (current != tail) {
                length++;
                System.out.print(current.data + " <-> ");
                current = current.next;
            }
            length++;
            System.out.print(current.data + " <-> ");
            System.out.println("None");
        } else {
            System.out.println("Linked List is empty.");
        }
    }

    public static void main(String[] args) {
        Day2LL cll = new Day2LL();

        cll.insertStart(40);
        cll.insertEnd(35);
        cll.insertStart(30);
        cll.insertEnd(25);
        cll.insertStart(20);
        cll.insertStart(10);
        cll.printList();
        // cll.deleteStart();
        // cll.deleteEnd();

        // cll.insertAtPos(5, 7);
        cll.reverse();
        // cll.deleteAtPos(6);
        cll.printList();
    }
}

// public class ReverseLinkedList {
// public static ListNode reverse(ListNode head) {
//     ListNode prev = null;
//     ListNode curr = head;
//     while (curr != null) {
//         ListNode next = curr.next; // save next node
//         curr.next = prev;          // reverse link
//         prev = curr;               // move prev forward
//         curr = next;               // move curr forward
//     }
//     return prev; // new head
// }
// }

