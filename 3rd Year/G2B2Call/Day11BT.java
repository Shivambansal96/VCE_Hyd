
public class Day11BT {

    int i = -1;

    public class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node createTree(int[] arr) {
        i++;

        if (arr[i] == -1) {
            return null;
        }

        Node root = new Node(arr[i]);
        root.left = createTree(arr);
        root.right = createTree(arr);

        return root;
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

        Day11BT bt = new Day11BT();

        int[] arr = {8, 4, 2, -1, -1, 5, -1, -1, 44, -1, -1};

        Node root = bt.createTree(arr);

        bt.preOrder(root);

    }
}
