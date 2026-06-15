
public class Day8BT {

    int i = -1;

    public class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public Node createTree(int data) {
    //     Node newNode = new Node(data);
    //     return newNode;
    // }
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

    public void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);

    }

    public void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public void postOrder(Node root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {

        Day8BT bt = new Day8BT();

        // Node root = bt.createTree(10);
        // root.left = bt.createTree(5);
        // root.right = bt.createTree(20);

        int[] nodes = {5, 3, -1, 8, -1, -1, 2, 1, -1, -1, 5, -1, -1};

        Node root = bt.createTree(nodes);

        bt.preOrder(root);

    }
}
