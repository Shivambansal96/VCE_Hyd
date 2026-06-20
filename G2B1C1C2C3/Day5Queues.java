
// public class Day5Queues {
//     int[] arr;
//     int front;
//     int rear;
//     public Day5Queues(int size) {
//         this.arr = new int[size];
//         this.front = -1;
//         this.rear = -1;
//     }
//     public boolean isEmpty() {
//         return rear == -1;
//     }
//     public boolean isFull() {
//         return rear == arr.length - 1;
//     }
//     public void offer(int data) {
//         if (this.isFull()) {
//             System.out.println("Queue OVERFLOW");
//         } else {
//             if (rear == -1) {
//                 front = 0;
//                 rear = 0;
//             } else {
//                 rear++;
//             }
//             arr[rear] = data;
//         }
//     }
//     public void poll() {
//         if (isEmpty()) {
//             System.out.println("Queue UNDERFLOW");
//         } else {
//             if (front == rear) {
//                 front = -1;
//                 rear = -1;
//             } else {
//                 for (int i = 1; i < arr.length; i++) {
//                     arr[i - 1] = arr[i];
//                 }
//                 rear--;
//             }
//         }
//     }
//     public void printQueue() {
//         if (isEmpty()) {
//             System.out.println("Queue is Empty !!!");
//         }
//         int temp = front;
//         while (temp <= rear) {
//             System.out.println(arr[temp++] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         Day5Queues q = new Day5Queues(3);
//         q.offer(10);
//         q.offer(20);
//         q.offer(30);
//         q.printQueue();
//         System.out.println("--------------------");
//         q.poll();
//         q.offer(10);
//         q.printQueue();
//     }
// }
// // ========================== SINGLE ENDED Queue ========================================
// // ========================== Double ENDED Queue ========================================
// public class Day5Queues {
//     public static void main(String[] args) {
//         ArrayDeque<Integer> dq = new ArrayDeque<>();
//         dq.offerLast(10);
//         dq.offerLast(20);
//         dq.offerFirst(5);
//         dq.pollLast();
//         System.out.println(dq);
//     }
// }
// // ========================== Double ENDED Queue ========================================
// // ========================== Circular Queue ========================================
public class Day5Queues {

    int[] arr;
    int front;
    int rear;
    int size;

    public Day5Queues(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % this.size == front;
    }

    public void offer(int data) {
        if (isFull()) {
            System.out.println("Queue OVERFLOW");
        } else {
            if (rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1) % size;
            }
            arr[rear] = data;
        }

    }

    public void poll() {
        if (isEmpty()) {
            System.out.println("Queue UNDERFLOW");
        } else if (front == rear) {
            front = -1;
            rear = -1;

        } else {
            front = (front + 1) % size;
        }

    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is EMpty");
        } else {
            int temp = front;
            while (temp != rear) {
                System.out.print(arr[temp] + " ");
                temp = (temp + 1) % size;
            }
            
            if (temp == rear) {
                System.out.print(arr[temp] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Day5Queues q = new Day5Queues(3);

        q.offer(10);
        q.offer(20);
        q.offer(30);
        // q.offer(50);

        q.poll();

        q.printQueue();
    }
}

// // ========================== Circular Queue ========================================
// // Prim's Algo
// // Kruskal Algo

