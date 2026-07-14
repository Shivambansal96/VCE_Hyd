// // ===== SINGLY LINKED LIST =================

// public class Day1LinkedList {
//     static Node head = null;
//     public static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static void main(String[] args) {
//         Day1LinkedList sll = new Day1LinkedList();
//         Node A = new Node(1);
//         Node B = new Node(2);
//         Node C = new Node(3);
//         Node D = new Node(4);
//         Node E = new Node(5);
//         A.next = B;
//         B.next = C;
//         C.next = D;
//         D.next = E;
//         head = A;
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " -> ");
//             current = current.next;
//         }
//         // System.out.print(current.data);
//         System.out.print("None");
//     }
// }
// // ===== SINGLY LINKED LIST =================
// ===== SINGLY LINKED LIST (with methods) =================
public class Day1LinkedList {

    static Node head = null;

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node append(int data) {
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

    public Node appendStart(int data) {

        Node newNode = new Node(data);
        // if(head == null) {
        //     head = newNode;
        // }

        // else {
        newNode.next = head;
        head = newNode;
        // }

        return newNode;

    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("LinkedList is Empty!");
        } else if (head.next == null) {
            System.out.println("Last Element (" + head.data + ") deleted... LinkedList became Empty!");
            head = null;
        } else {
            Node current = head;

            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;

        }
    }

    public int deleteStart() {
        if (head == null) {
            System.out.println("LL is empty!!!");
            return 0;
        }

        head = head.next;
        return 0;

    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {

        Day1LinkedList sll = new Day1LinkedList();
        // sll.append(9);
        // sll.appendStart(19);
        // sll.appendStart(91);
        // sll.append(900);
        sll.printList();

        sll.deleteStart();
        // sll.deleteEnd();
        sll.printList();

    }
}

// ===== SINGLY LINKED LIST (with methods) =================
