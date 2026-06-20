
// // // import java.util.Arrays;
// // // import java.util.Stack;
// // // ====================== Largest Rectangle in Histogram ================================
// // // ====================== Next Smaller Element ================================
// // // ====================== Next Greater Element ================================
// // // ====================== Next Greater Index ================================
// // // ====================== Previous Smaller Element ================================
// // // ====================== Previous Greater Element ================================
// // // ====================== Previous Greater Index ================================
// // // public class Day5Queues {
// // //     public static int[] nextGreaterElement(Stack<Integer> stk, int[] arr, int[] res) {
// // //         stk.clear();
// // //         for (int i = arr.length - 1; i >= 0; i--) {
// // //             while (!stk.isEmpty()) {
// // //                 if (stk.peek() > arr[i]) {
// // //                     res[i] = stk.peek();
// // //                     break;
// // //                 } else {
// // //                     stk.pop();
// // //                 }
// // //             }
// // //             stk.push(arr[i]);
// // //         }
// // //         return res;
// // //     }
// // //     public static int[] previousGreaterElement(Stack<Integer> stk, int[] arr, int[] res) {
// // //         stk.clear();
// // //         for (int i = 0; i < arr.length; i++) {
// // //             while (!stk.isEmpty()) {
// // //                 if (stk.peek() > arr[i]) {
// // //                     res[i] = stk.peek();
// // //                     break;
// // //                 } else {
// // //                     stk.pop();
// // //                 }
// // //             }
// // //             stk.push(arr[i]);
// // //         }
// // //         return res;
// // //     }
// // //     public static int[] previousSmallerElement(Stack<Integer> stk, int[] arr, int[] res) {
// // //         stk.clear();
// // //         for (int i = 0; i < arr.length; i++) {
// // //             while (!stk.isEmpty()) {
// // //                 if (stk.peek() < arr[i]) {
// // //                     res[i] = stk.peek();
// // //                     break;
// // //                 } else {
// // //                     stk.pop();
// // //                 }
// // //             }
// // //             stk.push(arr[i]);
// // //         }
// // //         return res;
// // //     }
// // //     public static int[] nextSmallerElement(Stack<Integer> stk, int[] arr, int[] res) {
// // //         stk.clear();
// // //         for (int i = arr.length - 1; i >= 0; i--) {
// // //             while (!stk.isEmpty()) {
// // //                 if (stk.peek() < arr[i]) {
// // //                     res[i] = stk.peek();
// // //                     break;
// // //                 } else {
// // //                     stk.pop();
// // //                 }
// // //             }
// // //             stk.push(arr[i]);
// // //         }
// // //         return res;
// // //     }
// // //     public static int[] previousSmallerIndex(Stack<Integer> stk, int[] arr, int[] res) {
// // //         stk.clear();
// // //         for (int i = 0; i < arr.length; i++) {
// // //             while (!stk.isEmpty()) {
// // //                 if (arr[stk.peek()] < arr[i]) {
// // //                     res[i] = stk.peek();
// // //                     break;
// // //                 } else {
// // //                     stk.pop();
// // //                 }
// // //             }
// // //             stk.push(i);
// // //         }
// // //         return res;
// // //     }
// // //     public static int[] nextSmallerIndex(Stack<Integer> stk, int[] arr, int[] res) {
// // //         stk.clear();
// // //         for (int i = arr.length - 1; i >= 0; i--) {
// // //             while (!stk.isEmpty()) {
// // //                 if (arr[stk.peek()] < arr[i]) { // Change 1 - Comparing values
// // //                     res[i] = stk.peek();
// // //                     break;
// // //                 } else {
// // //                     stk.pop();
// // //                 }
// // //             }
// // //             stk.push(i);   // Change 2 - Pushing index
// // //         }
// // //         return res;
// // //     }
// // //     public static void main(String[] args) {
// // //         // int[] arr = {4, 5, 2, 10, 8};  
// // //         int[] arr = {2, 1, 5, 6, 2, 3};
// // //         int n = arr.length;
// // //         Stack<Integer> stk = new Stack<>();
// // //         int[] leftRes = new int[n];
// // //         int[] rightRes = new int[n];
// // //         Arrays.fill(leftRes, -1);   
// // //         Arrays.fill(rightRes, n);
// // //         // for(int i = 0; i < n; i++) {
// // //         //     res[i] = -1;
// // //         // }
// // //         // res = previousGreaterElement(stk, arr, res);
// // //         leftRes = previousSmallerIndex(stk, arr, leftRes);
// // //         // res = nextGreaterElement(stk, arr, res);
// // //         rightRes = nextSmallerIndex(stk, arr, rightRes);
// // //         int maxArea = 0;
// // //         for (int i = 0; i < arr.length; i++) {
// // //             int window = rightRes[i] - leftRes[i] - 1;
// // //             int currentArea = arr[i] * window;
// // //             maxArea = Math.max(maxArea, currentArea);
// // //         }
// // //         System.out.println(maxArea);
// // //     }
// // // }
// // // ==============================  Queues =====================================
// // public class Day5Queues {
// //     int[] arr;
// //     int rear = -1;
// //     int front = -1;
// //     public Day5Queues(int size) {
// //         arr = new int[size];
// //     }
// //     public boolean isEmpty() {
// //         return front == -1 && rear == -1;
// //     }
// //     public boolean isFull() {
// //         return rear == arr.length - 1;
// //     }
// //     public void enqueue(int data) {
// //         if (isFull()) {
// //             System.out.println("Queue is Full");
// //         } else {
// //             if (isEmpty()) {
// //                 rear = 0;
// //                 front = 0;
// //             } else {
// //                 rear++;
// //             }
// //             arr[rear] = data;
// //         }
// //     }
// //     public void dequeue() {
// //         if (isEmpty()) {
// //             System.out.println("Queue is Empty");
// //         } else if (front == 0 && rear == 0) {
// //             front = rear = -1;
// //         } else {
// //             for (int i = 0; i < rear; i++) {
// //                 arr[i] = arr[i + 1];
// //             }
// //             rear--;
// //         }
// //     }
// //     public void displayQueue() {
// //         System.out.println("Queue = ");
// //         for (int i = front; i <= rear; i++) {
// //             System.out.print(arr[i] + " ");
// //         }
// //         System.out.println();
// //     }
// //     public static void main(String[] args) {
// //         Day5Queues q = new Day5Queues(5);
// //         q.enqueue(10);
// //         q.enqueue(20);
// //         q.enqueue(30);
// //         q.displayQueue();
// //         q.dequeue();
// //         q.dequeue();
// //         q.displayQueue();
// //     }
// // }
// // // ========================= Circular Queues ========================
// public class Day5Queues {
//     int[] arr;
//     int front = -1;
//     int rear = -1;
//     public Day5Queues(int size) {
//         arr = new int[size];
//     }
//     public boolean isEmpty() {
//         return front == -1 && rear == -1;
//     }
//     public boolean isFull() {
//         return (rear + 1) % arr.length == front;
//     }
//     public void append2(int data) {
//         if (isFull()) {
//             System.out.println("Queue is Full");
//         } else if (isEmpty()) {
//             rear = 0;
//             front = 0;
//             arr[rear] = data;
//         } else {
//             if (rear != arr.length - 1) {
//                 rear++;
//                 arr[rear] = data;
//             } else {
//                 rear = 0;
//                 arr[rear] = data;
//             }
//         }
//     }
//     public int append(int data) {
//         if (isFull()) {
//             System.out.println("Queue is Full");
//             return 0;
//         } else if (isEmpty()) {
//             rear = 0;
//             front = 0;
//             arr[rear] = data;
//             return data;
//         } else {
//             if (rear != arr.length - 1) {
//                 rear++;
//             } else {
//                 rear = 0;
//             }
//             arr[rear] = data;
//         }
//         return data;
//     }
//     public int dequeue() {
//         if (isEmpty()) {
//             System.out.println("Queue is Empty !!!");
//             return -1;
//         }
//         int removed = arr[front];
//         if (rear == front) {
//             front = -1;
//             rear = -1;
//         } else {
//             front = (front + 1) % arr.length;
//         }
//         return removed;
//     }
//     public void printQueue() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return;
//         }
//         System.out.print("Circular Queue = ");
//         int i = front;
//         while (true) {
//             System.out.print(arr[i] + " ");
//             if (i == rear) {
//                 break;
//             }
//             i = (i + 1) % arr.length;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Day5Queues cq = new Day5Queues(3);
//         cq.append(10);
//         cq.append(20);
//         cq.append(30);
//         cq.dequeue();
//         cq.append(50);
//         cq.append(40);
//         cq.dequeue();
//         cq.append(70);
//         cq.printQueue();
//     }
// }
