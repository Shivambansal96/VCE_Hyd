
import java.util.LinkedList;
import java.util.Queue;

public class Day9BT {

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

    public void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);

    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

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

    public static void levelOrderBfs(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int lenQ = q.size();
            for (int i = 0; i < lenQ; i++) {
                Node current = q.poll();

                System.out.print(current.data + " ");

                if (current.left != null)
                    q.offer(current.left);

                if (current.right != null)
                    q.offer(current.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Day9BT bt = new Day9BT();

        // Node A = new Node(100);
        // Node B = new Node(90);
        // Node C = new Node(130);
        // A.left = B;
        // A.right = C;
        // preOrder(A);
        // System.out.println(A.data);
        // System.out.println(B.data);
        // System.out.println(C.data);
        // int[] nodes = {5, 1, -1, -1, 7, -1, -1};
        int[] nodes = {2, 7, 2, -1, -1, 6, 5, -1, -1, 11, -1, -1, 5, -1, 9, 4, -1, -1, -1};

        Node root = bt.createTree(nodes);

        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // inOrder(root);
        // bt.preOrder(root);
        // postOrder(root);
        levelOrderBfs(root);

    }

}
