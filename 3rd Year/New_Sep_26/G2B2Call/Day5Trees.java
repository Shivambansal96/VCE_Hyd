
public class Day5Trees {

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
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) { // 30 < 60

            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void modifyNode(Node root, int target) {

        if (root == null) {
            return;
        }

        if (target < root.data) {
            modifyNode(root.left, target); // 30
         }else if (target > root.data) {
            modifyNode(root.right, target); 
        }else { // Target Found
            root.data = 51;
        }

    }

    public Node deleteNode(Node root, int target) {

        if (root == null) {
            return null;
        }

        // Search the Node you want to Delete
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
            }
            if (root.right == null) {
                return root.left;
            }

            // 2 child
            Node IOS = inOrderSuccessor(root.right);
            root.data = IOS.data;
            root.right = deleteNode(root.right, IOS.data);

        }

        return root;

    }

    public Node inOrderSuccessor(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
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
        Day5Trees bst = new Day5Trees();

        Node root = bst.insert(null, 60);
        bst.insert(root, 30);
        bst.insert(root, 90);
        bst.insert(root, 15);
        bst.insert(root, 45);
        bst.insert(root, 47);
        bst.insert(root, 120);
        bst.insert(root, 75);

        bst.inOrder(root);

        System.out.println();
        // bst.modifyNode(root, 60);
        bst.deleteNode(root, 60);

        bst.inOrder(root);

    }

}
