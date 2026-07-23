
public class Day9BST {

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

    public Node deleteNode(Node root, int target) {

        if (root == null) {
            return null;
        }

        if (root.data > target) {
            root.left = deleteNode(root.left, target);
        } else if (root.data < target) {
            root.right = deleteNode(root.right, target);
        } else { // Target Found

            // 0 Child
            if (root.left == null && root.right == null) {
                return null;
            }

            // 1 Child
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // 2 Children
            Node IOS = inOrderSuccessor(root.right);
            root.data = IOS.data;
            root.right = deleteNode(root.right, IOS.data);
        }
        return root;
    }

    public int heightOfTree(Node root) {
        if (root == null) {
            return -1;
        }

        int leftChild = heightOfTree(root.left);
        int rightChild = heightOfTree(root.right);

        return Math.max(leftChild, rightChild) + 1;
    }

    public Node inOrderSuccessor(Node root) {

        while (root.left != null) {
            root = root.left;
        }

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

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {

        Day9BST bst = new Day9BST();

        int[] arr = {20, 15, 22, 10, 5, 25, 60, 50, 40};

        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = bst.insert(root, arr[i]);
        }

        // bst.inOrder(root);
        // System.out.println();
        // System.out.println(bst.searchKey(20, root) ? "Target Found" : "Target NOT Found");
        // bst.deleteNode(root, 25);
        // bst.inOrder(root);
        // System.out.println();
        System.out.println(bst.heightOfTree(root));

    }

}
