
import java.util.Arrays;
import java.util.Stack;

// // import java.util.Arrays;
// // import java.util.Collections;
// // import java.util.Comparator;
// // public class Day4Stacks {
// //     public static void main(String[] args) {
// // // ================== Sort on the basis of Units  ===================
// //         ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(99, 19, 23, 56, 76, 10, 31));
// //         Comparator<Integer> cmp = (Integer a, Integer b) -> {
// //             if (a % 10 > b % 10) {
// //                 return 1;
// //             } else {
// //                 return -1;
// //             }
// //         };
// //         System.out.println(arrList);
// //         Collections.sort(arrList, cmp);
// //         System.out.println(arrList);
// // // ================= Sort on the basis of Odd/Even  =================
// //         Comparator<Integer> cmp2 = (Integer a, Integer b) -> {
// //             if (a % 2 == 0) {
// //                 return 1;
// //             }else {
// //                 return -1;
// //             }
// //         };
// //         System.out.println(arrList);
// //         Collections.sort(arrList, cmp2);
// //         System.out.println(arrList);
// //     }
// // }
// // // // ================= Map Interface  =================
// // public class Day4Stacks {
// //     public static void main(String[] args) {
// // // // ================= HashMap  =================
// //         // Map<Integer, String> hashMap = new HashMap<>();
// //         // hashMap.put(3, "Sejal");
// //         // hashMap.put(1, "Mohini");
// //         // hashMap.put(51, "Mohini");
// //         // hashMap.put(10, "Mohini");
// //         // hashMap.put(2, "Shivam");
// //         // System.out.println(hashMap);
// // // // ================= TreeMap  =================
// //         // Map<Integer, String> treeMap = new TreeMap<>();
// //         // treeMap.put(3, "Sejal");
// //         // treeMap.put(1, "Mohini");
// //         // treeMap.put(51, "Mohini");
// //         // treeMap.put(10, "Mohini");
// //         // treeMap.put(2, "Shivam");
// //         // System.out.println(treeMap);
// // // // ================= LinkedHashMap  =================
// //         // Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
// //         // linkedHashMap.put(3, "Sejal");
// //         // linkedHashMap.put(1, "Mohini");
// //         // linkedHashMap.put(51, "Mohini");
// //         // linkedHashMap.put(10, "Mohini");
// //         // linkedHashMap.put(2, "Shivam");
// //         // System.out.println(linkedHashMap);
// //         // // ================= TreeMap in-built Methods  =================
// //         // Map<String, String> treeMap = new TreeMap<>();
// //         // treeMap.put("name", "Shivam");
// //         // treeMap.put("isTrainer", "True");
// //         // treeMap.put("topic", "Maps");
// //         // System.out.println(treeMap.containsKey("names"));
// //         // System.out.println(treeMap.get("names"));
// //         // treeMap.putIfAbsent("author", "anonymous");
// //         // System.out.println("ALL = " + treeMap);
// //         // for (Map.Entry<String, String> data: treeMap.entrySet()) {
// //         //     System.out.println(data.getKey() + " -> " + data.getValue());
// //         // }
// // // // ================= Map Question from PPT  =================
// // // // ============ Element occurring more than [n/3] times =============
// //         // Map<Integer, Integer> hashMap = new HashMap<>();
// //         // int[] arr = {1, 4, 1, 4, 2, 1, 7, 9, 1}; // {1:4, 4:2, 2:1. 7:1, 9:1}
// //         // int n = arr.length; // 9
// //         // for (int i = 0; i < arr.length; i++) {
// //         //     if (hashMap.containsKey(arr[i])) {
// //         //         hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
// //         //     } else {
// //         //         hashMap.put(arr[i], 1);
// //         //     }
// //         // }
// //         // for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
// //         //     if (e.getValue() >= (n / 3)) {
// //         //         System.out.print(e.getKey() + " ");
// //         //     }
// //         // }
// //     }
// // }
// // // // ============ STACKS IMPLEMENTATION USING ARRAYS☺ =============
// // public class Day4Stack {
// //     int[] arr;
// //     int size;
// //     int top = -1;
// //     public Day4Stack(int size) {
// //         this.size = size;
// //         arr = new int[size];
// //     }
// //     public boolean isFull() {
// //         return arr.length - 1 == top;
// //     }
// //     public boolean isEmpty() {
// //         return top == -1;
// //     }
// //     public int peek() {
// //         if (isEmpty()) {
// //             System.out.println("Stack is Empty || UNDERFLOW");
// //             return -1;
// //         } else {
// //             return arr[top];
// //         }
// //     }
// //     public void push(int data) { // 4
// //         if (isFull()) {
// //             System.out.println("Stack is Full || OVERFLOW");
// //         } else {
// //             top++;
// //             arr[top] = data;
// //         }
// //     }
// //     public int pop() {
// //         if (isEmpty()) {
// //             System.out.println("Stack is Empty || UNDERFLOW");
// //             return -1;
// //         } else {
// //             int lastEle = arr[top];
// //             top--;
// //             return lastEle;
// //         }
// //     }
// //     public void printStack() {
// //         while (top != -1) {
// //             System.out.println(pop());
// //         }
// //     }
// //     public static void main(String[] args) {
// //         Day4Stack stk = new Day4Stack(4);
// //         stk.push(3);
// //         stk.push(2);
// //         stk.push(1);
// //         stk.printStack();
// //         stk.push(23);
// //         stk.printStack();
// //     }
// // }
// // // // ============ STACKS IMPLEMENTATION USING ARRAYLIST =============
// public class Day4Stacks {
//     List<Integer> arrList = new ArrayList<>();
//     int top = -1;
//     public boolean isEmpty() {
//         return top == -1;
//     }
//     public void push(int data) {
//         arrList.add(data);
//         top++;
//     }
//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack is Empty !!!");
//             return -1;
//         } else {
//             int lastEle = arrList.get(top);
//             arrList.remove(top);
//             top--;
//             return lastEle;
//         }
//     }
//     public int peek() {
//         if (isEmpty()) {
//             System.out.println("Stack is Empty !!!");
//             return -1;
//         }
//         return arrList.get(top);
//     }
//     public static void main(String[] args) {
//         Day4Stacks stk = new Day4Stacks();
//         stk.push(3);
//         stk.push(2);
//         stk.push(1);
//         while (!stk.isEmpty()) {
//             System.out.println(stk.pop());
//         }
//     }
// }
// // // // // ============ Valid Parentheses =============
// public class Day4Stacks {
//     public static void main(String[] args) {
//         Stack<Character> stk = new Stack<>();
//         boolean flag = true;
//         String s = "(()))";
//         if (s.equals("")) {
//             System.out.println("String is Empty !!!");
//         } else {
//             for (int i = 0; i < s.length(); i++) {
//                 if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//                     stk.push(s.charAt(i));
//                 } else {
//                     if (!stk.isEmpty()) {
//                         if (stk.peek() == '(' && s.charAt(i) == ')' || stk.peek() == '{' && s.charAt(i) == '}' || stk.peek() == '[' && s.charAt(i) == ']') {
//                             stk.pop();
//                         }
//                     } else {
//                         // System.out.println(false);
//                         flag = false;
//                         break;
//                     }
//                 }
//             }
//             if (flag) {
//                 System.out.println("Valid Parentheses");
//             } else {
//                 System.out.println("Invalid Parentheses");
//             }
//         }
//     }
// }
// // // // // ============ Valid Parentheses =============
// public class Day4Stacks {
//     public static boolean validParentheses(Stack<Character> stk, String s) {
//         Map<Character, Character> map = new HashMap<>();
//         map.put(')', '(');
//         map.put('}', '{');
//         map.put(']', '[');
//         if(s.equals(""))
//             return false;
//         for(int i = 0; i < s.length(); i++) {
//             if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
//                 stk.push(s.charAt(i));
//             }
//             else {
//                 if(stk.isEmpty())
//                     return  false;
//                 if(stk.peek().equals(map.get(')')) || stk.peek().equals(map.get('}')) || stk.peek().equals(map.get(']'))) {
//                     stk.pop();
//                 }
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Stack<Character> stk = new Stack<>();
//         String s = "(({}))";
//         boolean res = validParentheses(stk, s);
//         System.out.println(res);
//     }
// }
// // // // ============ Next Greater Element =============
public class Day4Stacks {

    public static int[] nextGreaterElement(Stack<Integer> stk, int[] arr, int[] res) {
        
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stk.isEmpty()) {
                if (stk.peek() > arr[i]) {
                    res[i] = stk.peek();
                    break;
                } else {
                    stk.pop();
                }
            }
            stk.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        int[] arr = {4, 5, 2, 10, 8};

        int n = arr.length;

        int[] res = new int[n];
        Arrays.fill(res, -1);

        res = nextGreaterElement(stk, arr, res);

        for (int val : res) {
            System.out.print(val + " ");
        }

    }
}
