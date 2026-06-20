
import java.util.Stack;

// ========================  STACK Using ARRAYS ======================================
// public class Day4Stacks {
//     int n;
//     int top;
//     int[] arr;
//     public Day4Stacks(int size) {
//         this.n = size;
//         this.top = -1;
//         this.arr = new int[size];
//         System.out.println("A Stack is Created");
//     }
//     public boolean isEmpty() {
//         return top == -1;
//     }
//     public boolean isFull() {
//         return top == n - 1;
//     }
//     public void push(int data) {
//         if (isFull()) {
//             System.out.println("Stack OVERFLOW");
//         } else {
//             top++;
//             arr[top] = data;
//         }
//     }
//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack UNDERFLOW");
//             return 0;
//         } else {
//             int send = arr[top];
//             top--;
//             return send;
//         }
//     }
//     public void printStack() {
//         if (isEmpty()) {
//             System.out.println("Stack is EMPTY!!!");
//         } else {
//             while (!isEmpty()) {
//                 // System.out.print(arr[top] + " ");
//                 System.out.print(this.pop() + " ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Day4Stacks stk = new Day4Stacks(3);
//         System.out.println(stk.isEmpty());
//         System.out.println(stk.isFull());
//         stk.push(10);
//         stk.push(20);
//         stk.push(30);
//         stk.pop(); // 30
//         stk.push(40);
//         stk.printStack();
//     }
// }
// ========================  STACK Using ARRAYS ======================================
// // ========================  STACK Using ARRAYLIST ======================================
// import java.util.ArrayList;
// public class Day4Stacks {
//     ArrayList<Integer> arrList;
//     public Day4Stacks() {
//         this.arrList = new ArrayList<>();
//     }
//     public boolean isEmpty() {
//         return arrList.size() == 0;
//     }
//     public void push(int data) {
//         arrList.add(data);
//     }
//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack is Empty!!!");
//             return 0;
//         } else {
//             int deleted = arrList.remove(arrList.size() - 1);
//             return deleted;
//         }
//     }
//     public void printStack() {
//         if (isEmpty()) {
//             System.out.println("Stack is Empty!!!");
//         } else {
//             while (!isEmpty()) {
//                 System.out.print(this.pop() + " ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Day4Stacks stk = new Day4Stacks();
//         stk.push(10);
//         stk.push(20);
//         stk.push(30);
//         stk.pop();
//         stk.push(40);
//         stk.printStack();
//         stk.push(100);
//         System.out.println();
//         stk.printStack();
//     }
// }
// // ========================  STACK Using ARRAYLIST ======================================
public class Day4Stacks {

    public static boolean validParentheses(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {
                if (stk.isEmpty()) {
                    return false;
                }
                if (stk.peek() == '(' && ch == ')' || stk.peek() == '{' && ch == '}' || stk.peek() == '[' && ch == ']') {
                    stk.pop();
                }
            }
        }

        return stk.isEmpty();

    }

    public static void main(String[] args) {

        String s = "[]]";

        if (validParentheses(s)) {
            System.out.println("VALID PARENTHESES");
        } else {
            System.out.println("INVALID PARENTHESES");
        }
    }
}
