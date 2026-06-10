
import java.util.LinkedList;
import java.util.Queue;

public class Day9BST {

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

    public Node createRoot(int data) {

        Node newNode = new Node(data);
        return newNode;

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

    public boolean searchKey(Node root, int target) {

        if (root == null) {
            return false;
        }

        if (target < root.data) {
            return searchKey(root.left, target);
        } else if (target > root.data) {
            return searchKey(root.right, target);
        } else {
            return true;
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

    public void levelOrderBfs(Node root) {

        Queue<Node> q = new LinkedList<>();

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

    public Node deleteNode(Node root, int val) {

        if (val > root.data) {
            root.right = deleteNode(root.right, val);  // 6   
        }
        
        else if (val < root.data) {
            root.left = deleteNode(root.left, val);
        } 
        
        else { // root.data == val

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

            // 2 Children
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

    public static void main(String[] args) {
        Day9BST bst = new Day9BST();

        Node root = bst.insert(20, null);

        bst.insert(16, root);
        bst.insert(10, root);
        bst.insert(23, root);
        bst.insert(54, root);

        bst.inOrder(root);
        System.out.println();

        if (bst.searchKey(root, 100)) {
            System.out.println("Target Found !!!");
        } else {
            System.out.println("Target NOT Found !!!");
        }
        System.out.println("--------------");

        bst.levelOrderBfs(root);

    }

}
