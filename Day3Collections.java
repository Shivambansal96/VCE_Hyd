
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Day3Collections {

    // // METHOD 1 (Big O(n sq) TC)
    // public static boolean checkDuplicatesM1(int n, int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // // METHOD 2 (Big O(n) TC)
    // public static boolean checkDuplicatesM2(int n, int[] arr) {
    //     Set<Integer> hashSet = new HashSet<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         if (hashSet.contains(arr[i])) {
    //             return true; 
    //         }else {
    //             hashSet.add(arr[i]);
    //         }
    //     }
    //     return false;
    // }
    public static void main(String[] args) {
        System.out.println("|| Day 3 Collections ||");
        System.out.println("-----------------");

        // List<Integer> arrList = new ArrayList<>(2, 4, 6, 8);  integers not allowed required
        //                                                                               objects
        // int n = 5;
        // int[] arr = new int[n]; // n = int
        // List<Integer> arrList = new ArrayList<>();
        // // print(myDict['name'])
        // // print(myDict.get('name'))
        // arrList.add(4);
        // arrList.add(2);
        // arrList.add(9);
        // arrList.add(17);
        // System.out.println("ArrayList = " + arrList);
        // List<Integer> linkedList = new LinkedList<>();
        // linkedList.add(4);
        // linkedList.add(2);
        // linkedList.add(9);
        // linkedList.add(17);
        // System.out.println("LinkedList = " + linkedList);
        // List<Integer> stk = new Stack<>();
        // stk.add(4);
        // stk.add(2);
        // stk.add(9);
        // stk.add(17);
        // System.out.println("Stack = " + stk);
        // Set<Integer> hashSet = new HashSet<>();
        // hashSet.add(4);
        // hashSet.add(9);
        // hashSet.add(300);
        // hashSet.add(1);
        // hashSet.add(77);
        // System.out.println("HashSet = " + hashSet + " // Randomized Order");
        // Set<Integer> treeSet = new TreeSet<>();
        // treeSet.add(4);
        // treeSet.add(9);
        // treeSet.add(300);
        // treeSet.add(1);
        // treeSet.add(77);
        // System.out.println("TreeSet = " + treeSet + " // Sorted Order");
        // Set<Integer> linkedHashSet = new LinkedHashSet<>();
        // linkedHashSet.add(4);
        // linkedHashSet.add(9);
        // linkedHashSet.add(300);
        // linkedHashSet.add(1);
        // linkedHashSet.add(77);
        // System.out.println("LinkedHashSet = " + linkedHashSet + " // Same Order");
        // // // Method 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // boolean m1res = checkDuplicatesM1(n, arr);
        // System.out.println(m1res);
        // boolean m2res = checkDuplicatesM2(n, arr);
        // System.out.println(m2res);
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(9);
        hashSet.add(300);
        hashSet.add(300);
        hashSet.add(1);
        hashSet.add(77);
        // System.out.println("HashSet = " + hashSet + " // Randomized Order");

        Iterator<Integer> it = hashSet.iterator();

        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }
        // Queue<Integer> q = new LinkedList<>();
        // q.offer(90);
        // q.offer(91);
        // q.offer(3);
        // q.offer(8);
        // System.out.println(q);
        // int top = q.peek();
        // System.out.println(top);
        // q.poll();
        // System.out.println(q);
        // ArrayDeque<Integer> q = new ArrayDeque<>();
        // q.offerLast(99);
        // q.offer(91);
        // q.offer(3);
        // q.offer(8);
        // q.offerFirst(0);
        // System.out.println(q);
        // int top = q.peek();
        // System.out.println(top);
        // q.poll();
        // System.out.println(q);
        // Queue<Integer> q = new PriorityQueue<>();
        // q.offerLast(99);
        // q.offer(91);
        // q.offer(3);
        // q.offer(8);
        // q.offer(3);
        // q.offer(1);
        // q.poll();
        // q.offerFirst(0);
        // System.out.println(q);
        // int top = q.peek();
        // System.out.println(top);
        // q.poll();
        // System.out.println(q);
        // Queue<Integer> pq = new PriorityQueue<>();
        // int[] arr = {5, 1, 10, 3, 12, 2, 8};
        // int k = 3;
        // for (int i = 0; i < arr.length; i++) {
        //     pq.add(arr[i]);
        //     if (k < pq.size()) {
        //         pq.poll();
        //     }
        // }
        // System.out.println(pq);
        // Queue<Integer> pq = new PriorityQueue<>();
        // List<Integer> arrList = new ArrayList<>();
        // int[] arr = {5, 1, 10, 3, 12, 2, 8};
        // int k = 3;
        // for (int i = 0; i < arr.length; i++) {
        //     pq.add(arr[i]);
        // }
        // for (int i = 0; i < k; i++) {
        //     int removedElement = pq.poll();
        //     arrList.add(removedElement);
        // }
        // System.out.println(pq);
        // System.out.println(arrList);
        // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // int[] arr = {5, 1, 10, 3, 12, 2, 8};
        // int k = 3;
        // for (int i = 0; i < arr.length; i++) {
        //     pq.add(arr[i]);
        //     if (k < pq.size())
        //         pq.poll();
        // }
        // System.out.println(pq);
        List<Integer> arrList = new ArrayList<>(Arrays.asList(22, 33, 41, 55, 69, 90));

        Comparator<Integer> comp = (Integer a, Integer b) -> {
            if (a % 10 > b % 10) {  //   2 < 3
                return 1;
            } else {
                return -1;
            }
        };

        System.out.println(arrList);

        Collections.sort(arrList, comp);

        System.out.println(arrList);

        // // Non-Lambda Expression
        // Comparator<Integer> comp = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer a, Integer b) {
        //         if(a % 10 > b % 10) {
        //             return -1;
        //         }
        //         else {
        //             return 1;
        //         }
        //     }
        // };
    }
}
