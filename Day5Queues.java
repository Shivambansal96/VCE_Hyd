// // // ====================== CIRCULAR Queue ================
public class Day5Queues {

    int size;
    int[] arr;
    int front;
    int rear;

    public Day5Queues(int size) {
        this.size = 0;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void offer(int data) {

        if (isFull()) {
            System.out.println("Queue is already Full !!! ");
            return;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            if (rear + 1 >= size) {
                rear = 0;
            } else {
                rear++;
            }
        }
        arr[rear] = data;
        size++;
    }

    public void poll() {
        if (isEmpty()) {
            System.out.println("Queue is already Empty !!! ");
        } else {
            if (front + 1 <= size) {
                front++;
            } else {
                front = 0;
            }
        }
        size--;
    }

    public void printQueue() {
        if (!this.isEmpty()) {
            for (int i = 0; i < size; i++) {
                System.out.println(" |   " + arr[i] + "  | ");
                System.out.println(" |-------| ");
            }
        } else {
            System.out.println("Queue is Empty !!!");
        }
    }

    public static void main(String[] args) {
        Day5Queues q = new Day5Queues(5);

        q.offer(10);
        q.offer(30);
        q.offer(50);
        q.offer(90);
        q.offer(130);

        q.printQueue();
        System.out.println("------------------");
        q.poll();
        q.printQueue();

        System.out.println();
        q.offer(13);
        q.printQueue();

    }
}
// // // ====================== CIRCULAR Queue ================

