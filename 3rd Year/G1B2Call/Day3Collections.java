
// //     public static void main(String[] args) {
// //         List<Integer> arrList = new ArrayList<>();
// //         arrList.add(10);
// //         arrList.add(20);
// //         arrList.add(30);
// //         arrList.remove(1);
// //         System.out.println(arrList.getFirst());
// //         // System.out.println(arrList);
// //         // System.out.println(arrList.contains(100));
// // //        System.out.print(arrList.get(2));
// //     }
// // }
// // import java.util.LinkedList;
// // import java.util.List;
// // public class Day3Collections {
// //     public static void main(String[] args) {
// //         List<Integer> linkedList = new LinkedList<>();
// //         linkedList.add(10);
// //         linkedList.add(20);
// //         linkedList.add(30);
// //         linkedList.remove(1);
// //         System.out.println(linkedList);
// //     }
// // // }
// // import java.util.Stack;
// // public class Day3Collections {
// //     public static void main(String[] args) {
// //         Stack<Integer> stk = new Stack<>();
// //         stk.add(10);
// //         stk.add(20);
// //         stk.add(30);
// //         stk.remove(1);
// //         System.out.println(stk);
// //     }
// // }
// // ====================== SETS =========================
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.List;
// import java.util.Set;
// public class Day3Collections {
//     public static void main(String[] args) {
//         // Set<Integer> hashSet = new HashSet<>();
//         // hashSet.add(25);
//         // hashSet.add(5);
//         // hashSet.add(15);
//         // hashSet.remove(1);
//         // System.out.println(hashSet.contains(33));
//         // System.out.println("HashSet = " + hashSet);
//         // Set<Integer> treeSet = new TreeSet<>();
//         // treeSet.add(25);
//         // treeSet.add(5);
//         // treeSet.add(15);
//         // treeSet.remove(1);
//         // System.out.println("TreeSet = " + treeSet);
//         // Set<Integer> linkedHashSet = new LinkedHashSet<>();
//         // linkedHashSet.add(25);
//         // linkedHashSet.add(5);
//         // linkedHashSet.add(15);
//         // linkedHashSet.remove(1);
//         // System.out.println("LinkedHashSet = " + linkedHashSet);
// //  // // ======== Practice Set for Check Duplicates =====
//         List<Integer> arrList = new ArrayList<>();
//         List<Integer> arr2 = new ArrayList<>();
//         boolean flag = false;
//         arrList.add(1);
//         arrList.add(4);
//         arrList.add(2);
//         arrList.add(1);
//         arrList.add(2);
//         arrList.add(15);
//         System.out.println(arrList);
//         Set<Integer> hashSet = new HashSet<>();
//         int count = 0;
//         for (int i = 0; i < arrList.size(); i++) {
//             if (hashSet.contains(arrList.get(i))) {
//                 flag = true;
//                 count++;
//                 arr2.add(arrList.get(i));
//             } else {
//                 hashSet.add(arrList.get(i));
//             }
//         }
//         System.out.println(flag ? count + " Duplicates" : "No");
//         System.out.println("Duplicate Array = "
//                 + arr2);
//         Iterator<Integer> it = hashSet.iterator();
//         System.out.println(" ------------------ ");
//         while (it.hasNext()) {
//             System.out.println(it.next());
//         }
//     }
// }
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Day3Collections {

    public static void main(String[] args) {

// // ============== QUEUE INTERFACE ==================
        // Queue<Integer> q = new LinkedList<>();
        // // q.offer(10);
        // // q.offer(30);
        // // q.offer(50);
        // System.out.println(q.poll());
        // // System.out.println(top);
        // // System.out.println(q.element());
        // // System.out.println(q.peek());
        // System.out.println(q);
        // ------------------------------------------
        // ArrayDeque<Integer> adq = new ArrayDeque<>();
        // adq.offer(10);
        // adq.offer(50);
        // adq.offer(100);
        // adq.offerFirst(5);
        // adq.offerLast(200);
        // adq.poll();
        // adq.pollLast();
        // System.out.println(adq);
        // ----------------------------------------------------------
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(1032);
        // pq.add(150);
        // pq.offer(15);
        // // pq.comparator();
        // // pq.removeIf(condition);
        // System.out.println(pq);
// // =========== K Largest Elements ===========
        // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(5, 8, 10, 3, 12, 2, 1));
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // int k = 3;
        // for (int i = 0; i < arrList.size(); i++) {
        //     pq.offer(arrList.get(i));
        //     if (pq.size() > k) {
        //         pq.poll();
        //     }
        // }
        // System.out.println(pq);
        // // =============== COMPARATOR ==================
        // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(9, 42, 1, 3, 45, 67));
        // // System.out.println(Collections.max(arrList));
        // System.out.println(arrList);
        // Collections.sort(arrList);
        // Collections.sort(arrList, Comparator.reverseOrder());
        // System.out.println(arrList);
// // =============== COMPARATOR ==================
        // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(9, 42, 1, 32, 45, 67));
        // Comparator<Integer> cmp = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer a, Integer b) {
        //         if (a % 10 > b % 10) {
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     }
        // };
        // Collections.sort(arrList, cmp);
        // System.out.println(arrList);
// // ========== COMPARATOR (LAMBDA) ==================
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(9, 42, 1, 32, 45, 67));

        Comparator<Integer> cmp = (Integer a, Integer b) -> {
            if (a % 2 >= b % 2) {
                return -1;
            } else {
                return 1;
            }
        };

        Collections.sort(arrList, cmp);

        System.out.println(arrList);

    }
}
