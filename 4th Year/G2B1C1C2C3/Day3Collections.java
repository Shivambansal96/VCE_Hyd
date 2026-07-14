
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Day3Collections {

    public static void main(String[] args) {

// // =============== LIST INTERFACE ==============================
//         // int[] arr = new int[5];
//         // dataType[] varName = new dataType[size];
//         List<Integer> arrList = new ArrayList<>();
//         List<Integer> arrList2 = new ArrayList<>();
//         arrList.add(1);
//         arrList.add(2);
//         arrList.add(3);
//         arrList.addFirst(1200);
//         arrList.add(1, 10);
//         arrList.addLast(12000);
//         // System.out.println(arrList.contains(2));
//         arrList2.add(100);
//         arrList2.addAll(arrList);
//         // System.out.println(arrList.remove(2));
//         System.out.println("Array List = " + arrList);
//         // System.out.println(arrList.get(2));
//         List<Integer> ll = new LinkedList<>();
//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         System.out.println("Linked List = " + ll);
//         List<Integer> stk = new Stack<>();
//         stk.add(1);
//         stk.add(2);
//         stk.add(4);
//         stk.add(3);
//         stk.remove(2);
//         System.out.println("Stack using List Interface = " + stk);
//         Stack<Integer> newStk = new Stack<>();
//         newStk.push(1);
//         newStk.push(2);
//         newStk.push(4);
//         newStk.push(3);
//         newStk.pop();
//         System.out.println("Stack using Stack Interface = " + newStk);
// // =============== LIST INTERFACE ==============================
// // =============== SET INTERFACE ==============================
        // Set<Integer> hashSet = new HashSet<>();
        // hashSet.add(31);
        // hashSet.add(12);
        // hashSet.add(2);
        // hashSet.add(20);
        // hashSet.add(14);
        // System.out.println("Hash Set (Random Order) = " + hashSet);
        // // hashSet.remove(20);
        // // System.out.println("Hash Set = " + hashSet);
// // =============== ITERATOR ==============================
        // Iterator it = hashSet.iterator();
        // int count = 0;
        // while (it.hasNext()) {
        //     count++;
        //     System.out.print(it.next() + " ");
        //     if (count == 3) {
        //         System.out.print("Middle ");
        //     }
        // }
// // =============== ITERATOR ==============================
        // // Set<Integer> treeSet = new TreeSet<>();
        // TreeSet<Integer> treeSet = new TreeSet<>();
        // treeSet.add(31);
        // treeSet.add(12);
        // treeSet.add(2);
        // treeSet.add(20);
        // treeSet.add(14);
        // System.out.print("Tree Set  (Descending Sorted Order) = ");
        // System.out.println(treeSet.descendingSet());
        // // System.out.println("Tree Set = " + treeSet);
        // // treeSet.remove(20);
        // System.out.println("Tree Set  (Ascending Sorted Order) = " + treeSet);
        // Set<Integer> linkedHashSet = new LinkedHashSet<>();
        // linkedHashSet.add(31);
        // linkedHashSet.add(12);
        // linkedHashSet.add(2);
        // linkedHashSet.add(20);
        // linkedHashSet.add(14);
        // System.out.println("Tree Set = " + treeSet); 
        // treeSet.remove(20);
        // System.out.println("Linked Hash Set (Same Input Order) = " + linkedHashSet);        
// // =============== SET INTERFACE ==============================
// // =============== QUESTION Check Duplicates O(n²) ========================
        // int[] arr = {1, 4, 1, 4, 2, 7, 6, 9, 1};
        // boolean flag = false;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             flag = true;
        //             break;
        //         }
        //     }
        // }
        // if (flag == true) {
        //     System.out.println(true);
        // } else {
        //     System.out.println(false);
        // }
// // =============== QUESTION Check Duplicates O(n²) ========================
// // =============== QUESTION Check Duplicates O(n) ========================
        // Set<Integer> hashSet = new HashSet<>();
        // int[] arr = {1, 4, 1, 4, 5, 6, 2, 4, 7};
        // boolean flag = false;
        // for (int i = 0; i < arr.length; i++) {
        //     if (hashSet.contains(arr[i])) {
        //         flag = true;
        //         break;
        //     } else {
        //         hashSet.add(arr[i]);
        //     }
        // }
        // if (flag) {
        //     System.out.println("Contains Duplicate Values");
        // } else {
        //     System.out.println("Contains Unique Values");
        // }
// // =============== QUESTION Check Duplicates O(n) ========================
// // =============== QUEUES INTERFACE ==============================
        // Queue<Integer> q = new LinkedList<>();
        // q.add(10);
        // q.add(20);
        // // System.out.println(q.element());
        // System.out.println(q);
        // q.remove();
        // q.remove();
        // q.remove();
        // System.out.println(q);
        // q.offer(10);
        // System.out.println(q);
        // System.out.println(q.peek());
        // q.poll();
        // q.poll();
        // // System.out.println(q);
        // System.out.println(q.peek());
        // System.out.println(q.size());
        // Queue<Integer> dq = new ArrayDeque<>();
        // ArrayDeque<Integer> dq = new ArrayDeque<>();
        // // dq.offerLast(100);
        // dq.offer(10);
        // dq.offer(20);
        // dq.offer(30);
        // dq.offer(40);
        // dq.offer(50);
        // System.out.println(dq.peekLast());
        // // dq.pollFirst();
        // dq.pollLast();
        // // System.out.println(dq.peek());
        // // dq.offerFirst(5);
        // System.out.println(dq);
        // Queue<Integer> pq = new PriorityQueue<>();
        // pq.add(10);
        // pq.add(12);
        // pq.add(16);
        // pq.add(100);
        // // pq.add(1);
        // // pq.add(4);
        // System.out.println(pq);
        // pq.poll();
        // System.out.println(pq);
// // =============== QUEUES INTERFACE QUESTION ==============================  
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr = {5, 1, 10, 3, 12, 2, 8};
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(pq);

    }
}
