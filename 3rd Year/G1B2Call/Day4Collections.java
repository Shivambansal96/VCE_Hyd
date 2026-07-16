
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Day4Collections {

    public static void main(String[] args) {
// // ========== MAP INTERFACE ====================
//         Map<String, Integer> hashMap = new HashMap<>();

//         hashMap.put("Shivam", 10);
//         hashMap.put("Mohini", 100);
//         hashMap.put("Shiv", 94);
//         hashMap.putIfAbsent("Shivam", 4);
//         System.out.print(hashMap);
//         // System.out.println(hashMap.containsKey("Shiv"));
//         // System.out.println(hashMap.get("Shiv"));
// // ========== MAP INTERFACE ====================
//         Map<String, Integer> LinkedHashMap = new LinkedHashMap<>();
//         LinkedHashMap.put("Shivam", 10);
//         LinkedHashMap.put("alex", 94);
//         LinkedHashMap.put("Mohini", 100);
//         LinkedHashMap.putIfAbsent("Shivam", 4);
//         // System.out.print(LinkedHashMap);
//         // System.out.println(LinkedHashMap.containsKey("Shiv"));
//         // System.out.println(LinkedHashMap.get("Shiv"));
// // ========== MAP INTERFACE ====================
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Shivam", 10);
        treeMap.put("Mohini", 100);
        treeMap.put("alex", 94);
        treeMap.putIfAbsent("Shivam", 4);
        // System.out.print(treeMap);
        // System.out.println(treeMap.containsKey("Shiv"));
        // System.out.println(treeMap.get("Shiv"));

        // for (Map.Entry<String, Integer> e : treeMap.entrySet()) {
        //     System.out.println(e.getValue());
        //     // System.out.println(e.getKey());
        // }
        // ============FREQUENCY CALCULATOR ============
        Map<Integer, Integer> hashMap = new HashMap<>();

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2));

        for (int i = 0; i < arrList.size(); i++) {

            if (hashMap.containsKey(arrList.get(i))) {
                hashMap.put(arrList.get(i), hashMap.get(arrList.get(i)) + 1);
            } else {
                hashMap.put(arrList.get(i), 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            if (e.getValue() >= arrList.size() / 3)
                System.out.println(e.getKey());
        }

        // System.out.println(hashMap);
    }

}
