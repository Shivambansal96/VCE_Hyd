
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
// // // // ====================== Double Ended Queue ================
// public class Day5Queues {
//     int size;
//     int[] arr;
//     int front;
//     int rear;
//     public Day5Queues(int size) {
//         this.size = 0;
//         this.arr = new int[size];
//         this.front = -1;
//         this.rear = -1;
//     }
//     public boolean isFull() {
//         return size == arr.length;
//     }
//     public boolean isEmpty() {
//         return size == 0;
//     }
//     public void offer(int data) {
//         if (isFull()) {
//             System.out.println("Queue is already Full !!! ");
//             return;
//         } else if (isEmpty()) {
//             front = rear = 0;
//         } else {
//             rear++;
//         }
//         arr[rear] = data;
//         size++;
//     }
//     public void offerFirst(int data) {
//         if (isFull()) {
//             System.out.println("Queue is already Full !!! ");
//             return;
//         } else if (isEmpty()) {
//             front = rear = 0;
//         } else {
//             for (int i = size; i > 0; i--) {
//                 arr[i] = arr[i - 1];
//             }
//             rear++;   // Corrected line.
//         }
//         arr[front] = data;
//         size++;
//     }
//     public void pollLast() {
//         if (isEmpty()) {
//             System.out.println("Queue is EMpty !!!");
//         } else {
//             rear--;
//             size--;
//         }
//     }
//     public void poll() {
//         if (isEmpty()) {
//             System.out.println("Queue is already Empty !!! ");
//         } else {
//             for (int i = 0; i < size - 1; i++) {
//                 arr[i] = arr[i + 1];
//             }
//             size--;
//             rear--;
//         }
//     }
//     public void printQueue() {
//         if (!this.isEmpty()) {
//             for (int i = 0; i < size; i++) {
//                 System.out.println(" |   " + arr[i] + "  | ");
//                 System.out.println(" |-------| ");
//             }
//         } else {
//             System.out.println("Queue is Empty !!!");
//         }
//     }
//     public static void main(String[] args) {
//         Day5Queues q = new Day5Queues(5);
//         q.offer(10);
//         q.offerFirst(20);
//         q.offer(30);
//         // q.offer(40);
//         // q.offer(50);
//         q.printQueue();
//         System.out.println();
//         q.pollLast();
//         q.printQueue();
//     }
// }
// // // // ====================== Double Ended Queue ================
// // // // ====================== Palindrome using Queue ================
// import java.util.ArrayDeque;
// public class Day5Queues {
//     public boolean palindrome(String s) {
//         ArrayDeque<Character> adq = new ArrayDeque<>();
//         for (int i = 0; i < s.length(); i++) {
//             adq.offer(s.charAt(i));
//         }
//         for (int i = 0; i < adq.size(); i++) {
//             if (!adq.pollFirst().equals(adq.pollLast())) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Day5Queues q = new Day5Queues();
//         String s = "madame";
//         if (q.palindrome(s)) {
//             System.out.println("Valid");
//         } else {
//             System.out.println("InValid");
//         }
//     }
// }
// // // // ====================== Palindrome using Queue ================
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

