
import java.util.LinkedList;
import java.util.Queue;

public class Day5Trees {

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

    public void levelOrderBFS(Node root) {
        if (root == null) {
            System.out.println("Tree is Empty !!!");
        }

        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                Node current = q.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    q.offer(current.left);
                }

                if (current.right != null) {
                    q.offer(current.right);
                }
            }
            System.out.println();
        }
    }

    public int minDepth(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int val = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                // System.out.print(curr.data + " ");
                if (curr.left == null && curr.right == null) {
                    return val;
                }

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            val++;
        }
        return val;

    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (root == null) {
            return null;
        }

        if (root.data == p.data || root.data == q.data) {
            return root;
        }

        Node leftCA = lowestCommonAncestor(root.left, p, q);
        Node rightCA = lowestCommonAncestor(root.right, p, q);

        if (leftCA != null && rightCA != null) {
            return root;
        } else if (leftCA != null) {
            return leftCA;
        } else {
            return rightCA;
        }

    }

    public static void main(String[] args) {
        Day5Trees bst = new Day5Trees();

        Node root = bst.insert(60, null);
        bst.insert(30, root);
        bst.insert(90, root);
        bst.insert(15, root);
        bst.insert(45, root);
        bst.insert(75, root);
        bst.insert(120, root);
        bst.insert(47, root);

        // bst.inOrder(root);
        // System.out.println();
        // bst.deleteNode(root, 50);
        bst.levelOrderBFS(root);
        System.out.println();
        System.out.println();

        System.out.println(bst.minDepth(root));

        Node p = new Node(90);
        Node q = new Node(120);

        System.out.println(bst.lowestCommonAncestor(root, p, q).data);

    }
}
