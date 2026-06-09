
public class Day8BT {

    class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void main(String[] args) {

        Day8BT bt = new Day8BT();

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(50);
        root.left.right = new Node(32);


    }
}
