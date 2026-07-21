
public class Day8BST {

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

    public Node insert(Node root, int data) {
        Node newNode = new Node(data);

        if (root == null) {
            return newNode;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean searchKey(int target, Node root) {

        if (root == null) {
            return false;
        }

        if (target < root.data) {
            searchKey(target, root.left);
        } else if (target > root.data) {
            searchKey(target, root.right);
        }

        return true;

    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {

        Day8BST bst = new Day8BST();

        Node root = null;
        root = bst.insert(root, 10);
        root = bst.insert(root, 20);
        root = bst.insert(root, 4);

        bst.inOrder(root);
        System.out.println();

        System.out.println(bst.searchKey(20, root) ? "Target Found" : "Target NOT Found");
    }

}
