// // // // //  SINGLY LINKED LIST
// public class Day1LinkedList {

//     static Node head;
//     static class Node {
//         int data;
//         Node next;
//         int count = 199;
//         Node(int data) {
//             this.data = data;
//             // this.data = 10;
//             this.next = null;
//         }
//     }
//     public void insertStart(int data) {
//         Node newNode = new Node(data); // newNode.data = 20, newNode.next = null;
//         if (head == null) {
//             head = newNode;
//         } else {
//             newNode.next = head;
//             head = newNode;
//         }
//         // // SAME AS ABOVE
//         // if (head == null) {
//         //     head = newNode;
//         //     return;
//         // }
//         // newNode.next = head;
//         // head = newNode;
//     }
//     public void insertEnd(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node current = head;
//             while (current.next != null) {
//                 current = current.next;
//             }
//             current.next = newNode;
//         }
//     }
//     public void deleteStart() {
//         if (head == null) {
//             System.out.println("Linked List is Empty!!!");
//         } else {
//             head = head.next;
//         }
//     }
//     public void deleteEnd() {
//         if (head == null) {
//             System.out.println("Linked List is Empty!!!");
//         } else if (head.next == null) {
//             head = null;
//         } else {
//             Node current = head;
//             while (current.next.next != null) {
//                 current = current.next;
//             }
//             current.next = null;
//         }
//     }
//     public void printList() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         System.out.println("None");
//     }
//     public static void main(String[] args) {
//         Day1LinkedList list = new Day1LinkedList();
//         // ================ STATIC IMPLEMENTATION ================
//         // Node n1 = new Node(10);
//         // Node n2 = new Node(20);
//         // Node n3 = new Node(30);
//         // head = n1;
//         // n1.next = n2;
//         // n2.next = n3;
//         // Node current = head;
//         // while (current != null) {
//         //     System.out.print(current.data + " -> ");
//         //     current = current.next;
//         // }
//         // System.out.println("None");
//         // ================ End of STATIC IMPLEMENTATION ================
//         // ================ DYNAMIC IMPLEMENTATION ================
//         list.insertStart(100);
//         // list.insertEnd(10);
//         // list.insertEnd(20);
//         // list.insertStart(200);
//         list.printList();
//         list.deleteEnd();
//         list.printList();
//         list.insertEnd(30);
//         list.insertStart(300);
//         list.insertEnd(40);
//         list.insertStart(5);
//         list.printList();
//     }
// }
// // // // // DOUBLY LINKED LIST
public class LinkedList {

    Node head;
    Node tail;

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

    LinkedList() {
        System.out.println("LL Created.");
    }

    public void insertStart(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("LL is Empty!!!");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("LL is Empty!!!");

        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {

            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printList() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("None");

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        // ll.insertStart(30);
        // ll.insertStart(20);
        // ll.insertStart(10);
        // ll.printList();
        // ll.insertEnd(40);
        ll.insertEnd(50);
        // ll.insertEnd(60);
        ll.printList();
        ll.deleteEnd();

        // ll.deleteStart();
        ll.printList();
    }

}
