
public class Day9BST {

    static int count = 0;

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

    public Node insert(int data, Node root) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(data, root.left);
        } else {
            root.right = insert(data, root.right);
        }

        return root;

    }

    public int countNode(Node root) {

        if (root == null) {
            return 0;
        }

        int left = countNode(root.left);
        int right = countNode(root.right);

        return left + right + 1;

    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        count++;
        inOrder(root.right);

    }

    public boolean searchKey(Node root, int target) {
        if (root == null) {
            return false;
        }

        if (root.data < target) {
            return searchKey(root.right, target);
        } else if (root.data > target) {
            return searchKey(root.left, target);
        } else {
            return true;
        }
    }

    public Node deleteNode(Node root, int target) {

        if (root == null) {
            return null;
        }

        if (root.data < target) {
            root.right = deleteNode(root.right, target);
        } else if (root.data > target) {
            root.left = deleteNode(root.left, target);
        } else { // target Found

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

            // 2 child
            Node IOS = IOS(root.right);
            root.data = IOS.data;
            root.right = deleteNode(root.right, IOS.data);

        }
        return root;
    }

    public static Node IOS(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {
        Day9BST bst = new Day9BST();

        Node root = bst.insert(20, null);
        bst.insert(10, root);
        bst.insert(60, root);
        bst.insert(230, root);
        bst.insert(110, root);
        bst.insert(30, root);
        bst.insert(90, root);

        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // bst.inOrder(root);
        // System.out.println(count);
        // System.out.println(bst.countNode(root));
        // if (bst.searchKey(root, 230)) {
        //     System.out.println("Target Found");
        // } else {
        //     System.out.println("Target NOT Found");
        // }
        bst.deleteNode(root, 20);

        bst.inOrder(root);

    }
}
