
public class Day6CircularQueue {

    int[] cq;
    int front = -1;
    int rear = -1;

    public Day6CircularQueue(int size) {
        this.cq = new int[size];
    }

    public boolean isFull() {
        return front + 1 == rear || rear + 1 == cq.length;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public void offer(int data) {
        if (isFull()) {
            System.out.println("Queue is already Full");
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            // // FORMULA // //
            // // // rear = (rear + 1) % cq.length;
            if (rear + 1 == cq.length) {
                rear = 0;
            } else {
                rear++;
            }
        }
        cq[rear] = data;
    }

    public void poll() {
        if (isEmpty()) {
            System.out.println("Queue is already Empty");
        } else {
            front = (front + 1) % cq.length;
        }
    }

    public static void main(String[] args) {

        Day6CircularQueue cq = new Day6CircularQueue(5);

        cq.offer(10);
        cq.printQueue();
    }

}
