
import java.util.HashMap;

public class Day4Stacks {

    int size;
    int[] arr;
    int top;

    public Day4Stacks(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        } else if (isEmpty()) {
            top = 0;
            arr[top] = data;
        } else {
            top++;
            arr[top] = data;
        }
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !!!");
            return 0;
        }

        int topper = arr[top];
        arr[top] = 0;
        top--;
        size--;

        return topper;
    }

    public int peek() {
        return arr[top];
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println("|   " + arr[i] + "    |");
            System.out.println("|---------|");
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
    }

    public boolean validParentheses(String s, Day4Stacks stk) {

        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else {
                if (isEmpty()) {
                    return false;
                } else {
                    if (stk.peek() == hashMap.get(ch) || stk.peek() == hashMap.get(ch) || stk.peek() == hashMap.get(ch)) {
                        stk.pop();
                    } else {
                        return false;
                    }
                }
            }

        }

        return isEmpty();
    }

    public static void main(String[] args) {

        Day4Stacks stk = new Day4Stacks(3);

        String s = "({})[])";

        System.out.println("Is Parentheses valid ? ");
        System.out.println(stk.validParentheses(s, stk));

        // System.out.println(stk.isFull());
        // // System.out.println(stk.isEmpty());
        // stk.push(10);
        // stk.push(20);
        // stk.push(30);
        // // stk.push(40);
        // stk.printStack();
        // stk.pop();
        // stk.printStack();
        // System.out.println(stk.peek());
    }
}
