
// public class Day4BStacks {
//     int[] stk;
//     int top = -1;
//     public Day4BStacks(int size) {
//         this.stk = new int[size];
//     }
//     public boolean isEmpty() {
//         return top == -1;
//     }
//     public boolean isFull() {
//         return top == stk.length - 1;
//     }
//     public void push(int data) {
//         if (this.isFull()) {
//             System.out.println("Stack is already Full");
//         } else {
//             top++;
//             stk[top] = data;
//         }
//     }
//     public void pop() {
//         if (this.isEmpty()) {
//             System.out.println("Stack is already Empty!");
//         } else {
//             stk[top] = 0;
//             top--;
//         }
//     }
//     public int peek() {
//         return stk[top];
//     }
//     public void printStack() {  // 10 20 30
//         // int dummy = top;    // top/dummy =  3
//         // for (int i = top; i >= 0; i--) {
//         for (int i = stk.length - 1; i >= 0; i--) {
//             System.out.println("|--------------|");
//             System.out.println("|      " + stk[i] + "      |");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Day4BStacks stak = new Day4BStacks(5);
//         stak.push(10);
//         stak.push(20);
//         stak.push(30);
//         stak.push(40);
//         stak.push(50);
//         stak.printStack();
//         stak.pop();
//         stak.printStack();
//         System.out.println(stak.peek());
//     }
// }
import java.util.Stack;

public class Day4BStacks {

    public static boolean validParentheses(String s, Stack<Character> stk) {
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else {
                if (!stk.isEmpty()) {
                    if (stk.peek() == '(' && ch == ')' || stk.peek() == '{' && ch == '}' || stk.peek() == '[' && ch == ']') {
                        stk.pop();
                    }
                } else {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Character> stk = new Stack<>();

        String s = "({}))";

        System.out.println(validParentheses(s, stk) ? "Valid Parentheses" : "InValid Parentheses");
    }
}
