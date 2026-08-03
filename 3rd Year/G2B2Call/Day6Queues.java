
public class Day6Queues {

    int[] q;
    int front = -1;
    int rear = -1;

    public Day6Queues(int size) {
        this.q = new int[size];
    }

    public boolean isFull() {
        return rear + 1 == q.length;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void offer(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        q[rear] = data;
    }

    public void offerFirst(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            int current = rear + 1;

            while (current > front) {
                q[current] = q[current - 1];
                current--;
            }
            q[front] = data;
            rear++;
        }
    }

    public int peek() {
        return q[front];
    }

    public int poll() {
        int top;
        if (isEmpty()) {
            System.out.println("Queue is already Empty!!");
            return 0;
        } else if (front == rear) {
            top = q[front];
            q[rear] = 0;
            front--;
            rear--;
            System.out.println("Queue became Empty!!");
        } else {
            top = q[front];

            int current = front;
            while (current <= rear) {
                q[current] = q[current + 1];
                current++;
            }
            rear--;
        }
        return top;
    }

    public int pollLast() {
        int top;
        if (isEmpty()) {
            System.out.println("Queue is already Empty!!");
            return 0;
        } else if (front == rear) {
            top = q[rear];
            q[rear] = 0;
            front--;
            rear--;
            System.out.println("Queue became Empty!!");
        } else {
            top = q[rear];
            q[rear] = 0;
            rear--;
        }
        return top;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Empty!!!");
            return;
        }
        int current = front;
        while (current <= rear) {
            System.out.print(q[current] + " ");
            current++;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Day6Queues q = new Day6Queues(5);

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offerFirst(100);
        q.printQueue();
        // System.out.println();
        System.out.println("Popped Element = " + q.pollLast());
        q.printQueue();
    }
}
