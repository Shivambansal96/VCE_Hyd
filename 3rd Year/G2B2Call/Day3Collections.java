
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Day3Collections {

    public static void main(String[] args) {
        // // // ================= LIST INTERFACE ====================
        // List<Integer> arrList = new ArrayList<>();
        // arrList.add(10);
        // arrList.add(20);
        // arrList.add(30);
        // System.out.println("ArrayList = " + arrList);

        // // // ===================================================
        // List<Integer> linkedList = new LinkedList<>();
        // linkedList.add(10);
        // linkedList.add(20);
        // linkedList.add(30);
        // System.out.println("LinkedList = " + linkedList);
        // // // ===================================================
        // Stack<Integer> stk = new Stack<>();
        // stk.add(10);
        // stk.add(20);
        // stk.add(30);
        // stk.addElement(100);
        // System.out.println("Stack = " + stk);
        // // // ===================================================
        // // // ================= SET INTERFACE ====================
        // Set<Integer> hashSet = new HashSet<>();
        // hashSet.add(30);
        // hashSet.add(20);
        // hashSet.add(10);
        // System.out.println("HashSet = " + hashSet);
        // // // // ===================================================
        // Set<Integer> treeSet = new TreeSet<>();
        // treeSet.add(30);
        // treeSet.add(20);
        // treeSet.add(10);
        // System.out.println("TreeSet = " + treeSet);
        // // // // ===================================================
        // Set<Integer> linkedHashSet = new LinkedHashSet<>();
        // linkedHashSet.add(30);
        // linkedHashSet.add(20);
        // linkedHashSet.add(10);
        // System.out.println("LinkedHashSet = " + linkedHashSet);
        // // // // ===================================================
        // // // // =================== CHECK DUPLICATES ===================
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 1, 4, 2, 6, 7, 9, 4));
        // // System.out.println(arr);
        // boolean flag = false;
        // Set<Integer> hashSet = new HashSet<>();
        // for (int i = 0; i < arr.size(); i++) {
        //     if (hashSet.contains(arr.get(i))) {
        //         flag = true;
        //         break;
        //     } else {
        //         hashSet.add(arr.get(i));
        //     }
        // }
        // System.out.println(flag ? "Duplicate Found" : "Duplicate NOT Found");
        // // // // =================== ITERATOR ===================
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 1, 4, 5));

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arrList);

        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
