
public class Day11BST {

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

    public Node createNode(int data, Node root) {

        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = createNode(data, root.left);
        } else {
            root.right = createNode(data, root.right);
        }

        return root;

    }

    public boolean searchElement(Node root, int target) {
        if (root == null) {
            return false;
        }

        if (target == root.data) {
            return true;
        } else if (target < root.data) {
            return searchElement(root.left, target);
        } else {
            return searchElement(root.right, target);
        }
    }

    public void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public Node deleteNode(Node root, int target) {

        if (root == null) {
            return null;
        }

        if (target < root.data) {
            root.left = deleteNode(root.left, target);
        } else if (target > root.data) {
            root.right = deleteNode(root.right, target);
        } else { // Target Found

            // 0 child
            if (root.left == null && root.right == null) {
                return null;
            }

            // 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // 2 children
            Node IOS = IOS(root.right);
            root.data = IOS.data;
            root.right = deleteNode(IOS, IOS.data);
            // root.right = root.right(50);

        }

        return root;

    }

    public static Node IOS(Node root) {
        Node current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    public static void main(String[] args) {

        Day11BST bst = new Day11BST();

        Node root = bst.createNode(20, null);

        // int[] arr = {93, 33, 11, 32, 42, 4, 99};
        int[] arr = {10, 30, 50};

        for (int i = 0; i < arr.length; i++) {
            root = bst.createNode(arr[i], root);
        }

        int target = 20;
        // boolean res = bst.searchElement(root, target);
        // System.out.println(res ? (target + " Found") : (target + " NOT Found"));

        bst.inOrder(root);
        bst.deleteNode(root, target);
        System.out.println();
        bst.inOrder(root);
    }

}
