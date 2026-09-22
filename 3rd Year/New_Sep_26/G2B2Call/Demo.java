
public class Demo {

    Node prev;

    public Demo() {
        this.prev = null;
    }

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
        if (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public Node lca(Node root, int p, int q) {
        if (root == null) {
            return null;
        }

        if (root.data == p || root.data == q) {
            return root;
        }

        Node leftLCA = lca(root.left, p, q);
        Node rightLCA = lca(root.right, p, q);

        if (leftLCA != null && rightLCA != null) {
            return root;
        } else if (leftLCA != null) {
            return leftLCA;
        } else {
            return rightLCA;
        }

    }

    public int minDistance(Node root) {

        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int ans = Integer.MAX_VALUE;

        if(root.left != null) {
            int minLeft = minDistance(root.left);
            ans = Math.min(minLeft, ans);
        }

        if(prev != null) {
            ans = Math.min(ans, root.data - prev.data);
        }
        prev = root;

        if(root.right != null) {
            int minRight = minDistance(root.right);
            ans = Math.min(ans, minRight);
        }

        return ans;
    }

    public boolean isValidBST(Node root, Node min, Node max) {

        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }

    public static void main(String[] args) {
        Demo bst = new Demo();

        Node root = bst.insert(50, null);
        bst.insert(30, root);
        bst.insert(210, root);
        bst.insert(130, root);
        bst.insert(13, root);
        bst.insert(8, root);
        bst.insert(90, root);
        bst.insert(2170, root);

        // bst.inOrder(root);
        // System.out.println();
        // bst.deleteNode(root, 50);
        // bst.inOrder(root);
        // System.out.println(bst.lca(root, 2170, 90).data);
        // System.out.println(bst.isValidBST(root, null, null));
        System.out.println(bst.minDistance(root));

    }
}
