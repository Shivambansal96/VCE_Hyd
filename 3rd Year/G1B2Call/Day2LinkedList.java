// // ======================= DOUBLY LINKED LIST =====================
// public class Day2LinkedList {

//     Node head;
//     Node tail;
//     int length = 0;
//     public class Node {
//         int data;
//         Node next;
//         Node prev;
//         public Node(int data) {
//             this.data = data;
//             this.prev = null;
//             this.next = null;
//         }
//     }
//     public Node appendStart(int data) {
//         Node newNode = new Node(data);
//         length++;
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             newNode.next = head;
//             head.prev = newNode;
//             head = newNode;
//         }
//         return newNode;
//     }
//     public Node appendEnd(int data) {
//         Node newNode = new Node(data);
//         length++;
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             tail.next = newNode;
//             newNode.prev = tail;
//             tail = newNode;
//         }
//         return newNode;
//     }
//     public Node appendAtPos(int data, int pos) {
//         Node newNode = new Node(data);
//         if (pos == 1) {
//             return appendStart(data);
//         }
//         if (pos == length + 1) {
//             return appendEnd(data);
//         }
//         Node current = head;
//         for (int i = 1; i < pos - 1; i++) {
//             current = current.next;
//         }
//         newNode.next = current.next;
//         newNode.prev = current;
//         newNode.next.prev = newNode;
//         current.next = newNode;
//         length++;
//         return newNode;
//     }
//     public void deleteStart() {
//         if (head == null) {
//             System.out.println("LL Is Empty !!!");
//         } else if (head == tail) {
//             head = null;
//             tail = null;
//         } else {
//             head = head.next;
//             head.prev = null;
//         }
//     }
//     public void deleteEnd() {
//         if (head == null) {
//             System.out.println("LL is Empty !!!");
//         } else if (head == tail) {
//             head = null;
//             tail = null;
//         } else {
//             tail = tail.prev;
//             tail.next = null;
//         }
//     }
//     public void deleteAtPos(int pos) {
//         if (pos == 1) {
//             this.deleteStart();
//             return;
//         }
//         if (pos == length + 1) {
//             this.deleteEnd();
//             return;
//         }
//         Node current = head;
//         for (int i = 1; i < pos - 1; i++) {
//             current = current.next;
//         }
//     }
//     public void printList() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " <-> ");
//             current = current.next;
//         }
//         System.out.println("None");
//     }
//     public static void main(String[] args) {
//         Day2LinkedList dll = new Day2LinkedList();
//         dll.appendEnd(10);
//         dll.appendEnd(20);
//         // dll.appendEnd(30);
//         // dll.appendStart(30);
//         // dll.appendStart(20);
//         // dll.appendStart(10);
//         // dll.appendAtPos(5, 2);
//         dll.printList();
//         // System.out.println(dll.length);
//         dll.deleteStart();
//         dll.printList();
//     }
// }
// // ======================= DOUBLY LINKED LIST =====================
// // ======================= DOUBLY LINKED LIST =====================
public class Day2LinkedList {

    Node head;
    Node tail;
    int length = 0;

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

    public Node appendStart(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        length++;
        return newNode;
    }

    public Node appendEnd(int data) {
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

        return newNode;
    }

    public void printList() {
        Node current = head;

        while (current != tail) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.print(current.data + " <-> ");
        System.out.println("None");

        // for (int i = 0; i < length; i++) {
        //     System.out.print(current.data + " <-> ");
        //     current = current.next;
        // }
    }

    public static void main(String[] args) {
        Day2LinkedList cll = new Day2LinkedList();

        // cll.appendStart(50);
        // cll.appendStart(40);
        // cll.appendStart(30);
        // cll.appendStart(20);
        // cll.appendStart(10);
        cll.appendEnd(10);
        cll.appendEnd(20);
        cll.appendEnd(30);
        cll.appendEnd(40);
        cll.appendEnd(50);
        cll.printList();
    }
}

// // ======================= CIRCULAR LINKED LIST =====================
