// import java.util.*;
// public class Day3Collections {
//     public static void main(String[] args) {
//         List<Integer> arrList = new ArrayList<>();

//         arrList.add(10);
//         arrList.add(20);
//         arrList.add(30);
//         arrList.remove(1);
//         System.out.println(arrList.getFirst());
//         // System.out.println(arrList);
//         // System.out.println(arrList.contains(100));
// //        System.out.print(arrList.get(2));
//     }
// }
// import java.util.LinkedList;
// import java.util.List;
// public class Day3Collections {
//     public static void main(String[] args) {
//         List<Integer> linkedList = new LinkedList<>();
//         linkedList.add(10);
//         linkedList.add(20);
//         linkedList.add(30);
//         linkedList.remove(1);
//         System.out.println(linkedList);
//     }
// // }
// import java.util.Stack;
// public class Day3Collections {
//     public static void main(String[] args) {
//         Stack<Integer> stk = new Stack<>();
//         stk.add(10);
//         stk.add(20);
//         stk.add(30);
//         stk.remove(1);
//         System.out.println(stk);
//     }
// }
// ====================== SETS =========================
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Day3Collections {

    public static void main(String[] args) {
        // Set<Integer> hashSet = new HashSet<>();

        // hashSet.add(25);
        // hashSet.add(5);
        // hashSet.add(15);
        // hashSet.remove(1);
        // System.out.println(hashSet.contains(33));
        // System.out.println("HashSet = " + hashSet);
        // Set<Integer> treeSet = new TreeSet<>();
        // treeSet.add(25);
        // treeSet.add(5);
        // treeSet.add(15);
        // treeSet.remove(1);
        // System.out.println("TreeSet = " + treeSet);
        // Set<Integer> linkedHashSet = new LinkedHashSet<>();
        // linkedHashSet.add(25);
        // linkedHashSet.add(5);
        // linkedHashSet.add(15);
        // linkedHashSet.remove(1);
        // System.out.println("LinkedHashSet = " + linkedHashSet);
//  // // ======== Practice Set for Check Duplicates =====
        List<Integer> arrList = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        boolean flag = false;

        arrList.add(1);
        arrList.add(4);
        arrList.add(2);
        arrList.add(1);
        arrList.add(2);
        arrList.add(15);

        System.out.println(arrList);

        Set<Integer> hashSet = new HashSet<>();

        int count = 0;
        for (int i = 0; i < arrList.size(); i++) {
            if (hashSet.contains(arrList.get(i))) {
                flag = true;
                count++;
                arr2.add(arrList.get(i));
            } else {
                hashSet.add(arrList.get(i));
            }
        }

        System.out.println(flag ? count + " Duplicates" : "No");
        System.out.println("Duplicate Array = "
                + arr2);

        Iterator<Integer> it = hashSet.iterator();
        System.out.println(" ------------------ ");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
