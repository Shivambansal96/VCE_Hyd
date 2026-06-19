

public class Day4Collections {

    public static void main(String[] args) {
        // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        // System.out.println("arrList = " + arrList);
        // arrList.add(51);
        // arrList.add(99);
        // arrList.add(17);
        // arrList.add(124);
        // arrList.add(110);
        // arrList.add(47);

        // int[] arr = {110, 51, 124, 17, 47, 99};
        // int[] arr = {110, 51, 124, 47, 17, 99};
        // System.out.println(arrList);
        // Collections.sort(arrList, Collections.reverseOrder());
        // System.out.println(arrList);
        // System.out.println(Collections.min(arrList));
        // System.out.println(Collections.max(arrList));
        // System.out.println("Element 4 is appearing " + Collections.frequency(arrList, 4) + " times.");
// // ========== Sort/Compare using units value (Custom logic) =================
//         Comparator<Integer> cmp = new Comparator<Integer>() {
//             @Override
//             public int compare(Integer a, Integer b) {
//                 if (a % 2 == 1) {
//                     return 1;
//                 } else {
//                     return -1;
//                 }
//             }
//         };
//         Comparator<Integer> comp = (Integer a, Integer b) -> {
//             if (a % 2 == 1) {
//                 return 1;
//             } else {
//                 return -1;   
//             }
//         };
//         System.out.println(arrList);
//         Collections.sort(arrList, cmp);
//         System.out.println(arrList);
// // // ========== Sort/Compare using units value (Custom logic) =================
//         Comparator<Integer> cmp = new Comparator<Integer>() {
//             @Override
//             public int compare(Integer a, Integer b) {
//                 if (a % 10 > b % 10) {
//                     return 1;
//                 } else {
//                     return -1;
//                 }
//             }
//         };
//         System.out.println(arrList);
//         Collections.sort(arrList, cmp);
//         System.out.println(arrList);
// // ========== Sort/Compare using units value (Custom logic) =================
// // =========================== Map Interface ================================
        // Map<String, Integer> hashMap = new HashMap<>();
        // hashMap.put("Shivam", 99);
        // hashMap.put("Sejal", 91);
        // hashMap.put("Tithee", 12);
        // hashMap.putIfAbsent("Shivam", 9);
        // System.out.println("Hash Map = " + hashMap);
        // Map<String, Integer> LinkedHashMap = new LinkedHashMap<>();
        // LinkedHashMap.put("Shivam", 99);
        // LinkedHashMap.put("Sejal", 91);
        // LinkedHashMap.put("Tithee", 12);
        // LinkedHashMap.putIfAbsent("Shivam", 9);
        // System.out.println("Linked Hash Map = " + LinkedHashMap);
        // Map<String, Integer> treeMap = new TreeMap<>();
        // treeMap.put("Shiva", 999);
        // treeMap.put("sejal", 91);
        // treeMap.put("Tithee", 12);
        // treeMap.put("10", 99);
        // treeMap.putIfAbsent("Shivam", 9);
        // System.out.println("Tree Map = " + treeMap);
// // =========================== Map ITERATION ================================
        // ArrayList<Integer> arr = new ArrayList<>();
        // for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
        //     System.out.println(e.getKey() + "--> " + e.getValue());
        //     arr.add(e.getValue());
        // }
// // =========================== Map Interface ================================
// // =========================== Frequency Calculator ================================
//         int[] arr = {1, 4, 1, 4, 2, 1, 7, 9, 1};
//         // int[] arr = {3, 3, 5};
//         Map<Integer, Integer> hashMap = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             if (hashMap.containsKey(arr[i])) {
//                 hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
//             } else {
//                 hashMap.put(arr[i], 1);
//             }
//         }
//         // System.out.println("Frequency Distribution = " + hashMap);
// // //   ====================== Count [n/3] or more times ============================
//         int n = arr.length;
//         for (Map.Entry<Integer, Integer> mapIterator : hashMap.entrySet()) {
//             if (mapIterator.getValue() >= (n / 3)) {
//                 System.out.println(mapIterator.getKey());
//             }
//         }
    }
}
