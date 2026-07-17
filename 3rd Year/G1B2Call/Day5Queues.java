// // // ====================== Queue ================
// public class Day5Queues {
//     int size;
//     int[] arr;
//     int top;
//     public Day5Queues(int size) {
//         this.size = 0;
//         this.arr = new int[size];
//         this.top = -1;
//     }
//     public boolean isFull() {
//         return size == arr.length;
//     }
//     public boolean isEmpty() {
//         return size == 0;
//     }
//     public void enqueue(int data) {
//         if (isFull()) {
//             System.out.println("Queue is already Full !!! ");
//         } else {
//             top++;
//             arr[top] = data;
//             size++;
//         }
//     }
//     public void dequeue() {
//         if (isEmpty()) {
//             System.out.println("Queue is already Empty !!! ");
//         } else {
//             for (int i = 0; i < size - 1; i++) {
//                 arr[i] = arr[i + 1];
//             }
//             size--;
//             top--;
//         }
//     }
//     public void printQueue() {
//         for (int i = 0; i < size; i++) {
//             System.out.println(" |   " + arr[i] + "  | ");
//             System.out.println(" |-------| ");
//         }
//     }
//     public static void main(String[] args) {
//         Day5Queues q = new Day5Queues(5);
//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.printQueue();
//         System.out.println();
//         q.dequeue();
//         q.printQueue();
//     }
// }
// // // ====================== Queue ================
// // // ====================== Double Ended Queue ================

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
            rear++;
        }
        arr[rear] = data;
        size++;
    }

    public void poll() {
        if (isEmpty()) {
            System.out.println("Queue is already Empty !!! ");
        } else {
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            front--;
        }
    }

    public void printQueue() {
        for (int i = 0; i < size; i++) {

            System.out.println(" |   " + arr[i] + "  | ");
            System.out.println(" |-------| ");

        }
    }

    public static void main(String[] args) {
        Day5Queues q = new Day5Queues(5);

        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.printQueue();

    }
}
// // // ====================== Double Ended Queue ================
