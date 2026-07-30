
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day4ACollections {

    /**
     * @param args
     */
    public static void main(String[] args) {
// ====================== QUEUE INTERFACE ========================
        // Queue<Integer> q = new LinkedList<>();
        // q.offer(10);
        // q.offer(20);
        // q.offer(30);
        // System.out.println("Queue = " + q);
        // // q.remove();
        // // // System.out.println(q);
        // // q.poll();
        // // // System.out.println(q);
        // // System.out.println(q.peek());
        // ArrayDeque<Integer> adq = new ArrayDeque<>();
        // adq.offer(30);
        // adq.offer(20);
        // adq.offer(10);
        // System.out.println("Array DeQueue = " + adq);
        // Queue<Integer> pq = new PriorityQueue<>();
        // pq.offer(1000);
        // pq.offer(200);
        // pq.offer(300);
        // pq.offer(3);
        // System.out.println("Priority Queue = " + pq);
// // ====================== k Largest Elements ========================
//         ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(5, 1, 10, 3, 12, 2, 8));
//         // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         int k = 3;

//         for (int i = 0; i < arrList.size(); i++) {
//             pq.offer(arrList.get(i));
//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }
//         System.out.println(pq);
// // ====================== k Smallest Elements ========================
//         ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(5, 1, 10, 3, 12, 2, 8));
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         PriorityQueue<Integer> pq2 = new PriorityQueue<>();
//         int k = 3;
//         for (int i = 0; i < arrList.size(); i++)
//             pq.offer(arrList.get(i));
//         for (int i = 0; i < k; i++)
//             pq2.offer(pq.poll());
//         System.out.println(pq2);
// // // ====================== COMPARATOR ========================
//         // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(5, 1, 10, 3, 12, 2, 8));
//         ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(90, 87, 55, 12, 4, 11));
//         System.out.println(arrList);
//         Comparator<Integer> cmp = (Integer a, Integer b) -> {
//             if (a % 10 > b % 10) {
//                 return 1;
//             } else {
//                 return -1;
//             }
//         };
//         // Collections.sort(arrList, Comparator.reverseOrder());
//         Collections.sort(arrList, cmp);
//         System.out.println(arrList);
// // // ====================== COMPARATOR ========================
// // // ====================== COMPARATOR ========================
//         // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(5, 1, 10, 3, 12, 2, 8));
//         ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(90, 87, 55, 12, 4, 11));
//         System.out.println(arrList);
//         Comparator<Integer> cmp = (Integer a, Integer b) -> {
//             if (a % 2 == 1) {
//                 return 1;
//             } else {
//                 return -1;
//             }
//         };
//         // Collections.sort(arrList, Comparator.reverseOrder());
//         Collections.sort(arrList, cmp);
//         System.out.println(arrList);
// // // ====================== COMPARATOR ========================
// // // ====================== COMPARATOR ========================
//         // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(5, 1, 10, 3, 12, 2, 8));
//         ArrayList<String> arrList = new ArrayList<>(Arrays.asList("Zoe", "Shivam", "Mohini", "Alex"));
//         System.out.println(arrList);
//         Comparator<String> cmp = (String a, String b) -> {
//             if (a.charAt(0) > b.charAt(0)) {
//                 return 1;
//             } else {
//                 return -1;
//             }
//         };
//         // Collections.sort(arrList, Comparator.reverseOrder());
//         Collections.sort(arrList, cmp);
//         System.out.println(arrList);
// // // ====================== MAP INTERFACE ========================
        // Map<String, Integer> hashMap = new HashMap<>();
        // hashMap.put("Mohini", 77);
        // hashMap.put("Shivam", 99);
        // hashMap.put("Sejal", 55);
        // System.out.println("HashMap = " + hashMap);
        // Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        // linkedHashMap.put("Mohini", 77);
        // linkedHashMap.put("Shivam", 99);
        // linkedHashMap.put("Sejal", 55);
        // System.out.println("LinkedHashMap = " + linkedHashMap);
        // Map<String, Integer> treeMap = new TreeMap<>();
        // treeMap.put("Mohini", 77);
        // treeMap.put("Shivam", 99);
        // treeMap.put("Sejal", 55);
        // treeMap.putIfAbsent("Shiva", 22);
        // // System.out.println("TreeMap = " + treeMap);
        // for (Map.Entry<String, Integer> e : treeMap.entrySet()) {
        //     System.out.println(e.getKey());
        // }
        // // ========== FREQUENCY COUNT ========
        // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(5, 5, 10, 3, 5, 2, 8));
        // HashMap<Integer, Integer> hashMap = new HashMap<>();
        // for (int i = 0; i < arrList.size(); i++) {
        //     if (hashMap.containsKey(arrList.get((i)))) {
        //         hashMap.put(arrList.get(i), hashMap.get(arrList.get(i)) + 1);
        //     } else {
        //         hashMap.put(arrList.get(i), 1);
        //     }
        // }
        // System.out.println(hashMap);
        // ========== Frequency more than or equal to [n/3] ========
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(5, 5, 10, 3, 5, 2, 8));

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arrList.size(); i++) {
            if (hashMap.containsKey(arrList.get((i)))) {
                hashMap.put(arrList.get(i), hashMap.get(arrList.get(i)) + 1);
            } else {
                hashMap.put(arrList.get(i), 1);
            }
        }

        // System.out.println(hashMap);
        int n = arrList.size();
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            if (e.getValue() >= n / 3) {
                System.out.println(e.getKey());
            }
        }
    }

}
