
// // ============== Spiral Export of Service Health Grid ==============
// import java.util.Scanner;
// public class Days10Graphs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows and columns: ");
//         int m = sc.nextInt();
//         int n = sc.nextInt();
//         int[][] matrix = new int[m][n];
//         System.out.println("Enter the matrix elements row by row:");
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         int top = 0, bottom = m - 1;
//         int left = 0, right = n - 1;
//         System.out.print("Spiral Order: ");
//         while (top <= bottom && left <= right) {
//             for (int j = left; j <= right; j++) {
//                 System.out.print(matrix[top][j] + " ");
//             }
//             top++;
//             for (int i = top; i <= bottom; i++) {
//                 System.out.print(matrix[i][right] + " ");
//             }
//             right--;
//             if (top <= bottom) {
//                 for (int j = right; j >= left; j--) {
//                     System.out.print(matrix[bottom][j] + " ");
//                 }
//                 bottom--;
//             }
//             if (left <= right) {
//                 for (int i = bottom; i >= top; i--) {
//                     System.out.print(matrix[i][left] + " ");
//                 }
//                 left++;
//             }
//         }
//         sc.close();
//     }
// }
// // ============== (END) Spiral Export of Service Health Grid ==============
// // ============== Adaptive Cooling Corridor Analyzer ==============
// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.Scanner;
// public class Days10Graphs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N (number of sectors) and K (maximum allowed fluctuation): ");
//         int N = sc.nextInt();
//         long K = sc.nextLong();
//         long[] loads = new long[N];
//         System.out.println("Enter the thermal loads of the sectors:");
//         for (int i = 0; i < N; i++) {
//             loads[i] = sc.nextLong();
//         }
//         Deque<Integer> maxDeque = new ArrayDeque<>();
//         Deque<Integer> minDeque = new ArrayDeque<>();
//         int left = 0;
//         int maxLength = 0;
//         for (int right = 0; right < N; right++) {
//             while (!maxDeque.isEmpty()
//                     && loads[maxDeque.peekLast()] <= loads[right]) {
//                 maxDeque.pollLast();
//             }
//             maxDeque.offerLast(right);
//             while (!minDeque.isEmpty()
//                     && loads[minDeque.peekLast()] >= loads[right]) {
//                 minDeque.pollLast();
//             }
//             minDeque.offerLast(right);
//             while (loads[maxDeque.peekFirst()]
//                     - loads[minDeque.peekFirst()] > K) {
//                 if (maxDeque.peekFirst() == left) {
//                     maxDeque.pollFirst();
//                 }
//                 if (minDeque.peekFirst() == left) {
//                     minDeque.pollFirst();
//                 }
//                 left++;
//             }
//             maxLength = Math.max(maxLength, right - left + 1);
//         }
//         System.out.println("Maximum valid corridor length: " + maxLength);
//         sc.close();
//     }
// }
// // ============== (END) Adaptive Cooling Corridor Analyzer ==============
// // ============== Evacuation Boat Dispatch for Rescue Operations ==============
// import java.util.Arrays;
// import java.util.Scanner;

// public class Days10Graphs {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of people and boat weight limit: ");
//         int n = sc.nextInt();
//         int limit = sc.nextInt();

//         int[] people = new int[n];

//         System.out.println("Enter the weights of the people:");
//         for (int i = 0; i < n; i++) {
//             people[i] = sc.nextInt();
//         }

//         Arrays.sort(people);

//         int left = 0;
//         int right = n - 1;
//         int boats = 0;

//         while (left <= right) {
//             if (people[left] + people[right] <= limit) {
//                 left++;
//             }
//             right--;
//             boats++;
//         }

//         System.out.println("Minimum number of boats required: " + boats);

//         sc.close();
//     }
// }
// // ============== (END) Evacuation Boat Dispatch for Rescue Operations ==============

// import java.util.ArrayList;
// public class Days10Graphs {
//     public class Edge {
//         int src;
//         int dest;
//         Edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;
//         }
//     }
//     public void createEdge(ArrayList<Edge>[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = new ArrayList<>();
//         }
//         for (ArrayList<Days10Graphs.Edge> element : arr) {
//             System.out.println(element);
//         }
//     }
//     public static void main(String[] args) {
//         Days10Graphs graphs = new Days10Graphs();
//         int vertices = 3;
//         @SuppressWarnings("unchecked")
//         // This is an array ->
//         // dataType varName = new dataType[size];
//         // int[] arr = new int[size];
//         ArrayList<Edge>[] arr = new ArrayList[vertices];
//         graphs.createEdge(arr);
//     }

// }
