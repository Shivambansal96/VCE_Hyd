// // // ================ Manual Creation (Brute Force) ==========

// public class Day8BT {
//     public static class Node {
//         int data;
//         Node left;
//         Node right;
//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static void main(String[] args) {
//         Day8BT bt = new Day8BT();
//         Node root = new Node(12);
//         Node B = new Node(88);
//         Node C = new Node(54);
//         Node D = new Node(154);
//         Node E = new Node(38);
//         root.left = B;
//         root.right = C;
//         B.right = D;
//         C.right = E;
//         System.out.println(root.data);
//         System.out.println(root.left.data);
//         System.out.println(root.right.data);
//         System.out.println(root.left.right.data);
//         System.out.println(root.right.right.data);
//     }
// }
// // // ================ Manual Creation (Brute Force) ==========
// // // ================ Manual Creation (Dynamic Implementation) ==========
public class Day8BT {

    int i = -1;

    public static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node createTree(int[] nodes) {
        i++;

        if (nodes[i] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[i]);
        newNode.left = createTree(nodes);
        newNode.right = createTree(nodes);

        return newNode;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        Day8BT bt = new Day8BT();
        // int[] nodes = {2, 7, 2, -1, -1, 6, 5, -1, -1, 11, -1, -1, 5, -1, 9, 4, -1};
        int[] nodes = {2, 1, -1, -1, 6, -1, -1};
        Node root = bt.createTree(nodes);

        bt.preOrder(root);

    }

}
