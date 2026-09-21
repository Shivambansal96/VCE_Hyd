
public class Day4Trees {

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
        } else if (data > root.data) {
            root.right = insert(data, root.right);
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
            }
            if (root.right == null) {
                return root.left;
            }

            // 2 children

            Node IOS = inOrderSuccessor(root.right);
            root.data = IOS.data;
            root.right = deleteNode(root.right, IOS.data);

        }

        return root;

    }

    public Node inOrderSuccessor(Node root) {
        if(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {
        Day4Trees bst = new Day4Trees();

        Node root = bst.insert(50, null);
        bst.insert(30, root);
        bst.insert(210, root);
        bst.insert(130, root);
        bst.insert(13, root);
        bst.insert(8, root);
        bst.insert(90, root);
        bst.insert(2170, root);

        bst.inOrder(root);
        System.out.println();
        bst.deleteNode(root, 50);
        bst.inOrder(root);


    }
}
