
import java.util.Arrays;

public class Day5Stacks {

    int size;
    int[] arr;
    int top;

    public Day5Stacks(int size) {
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

    public void clearStack() {
        while (!this.isEmpty()) {
            this.pop();
        }
    }

// // ======================= NEXT GREATER ELEMENT ===================
    public int[] nextGreaterElement(int[] arr, int[] res, Day5Stacks stk) {

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
// // ======================= NEXT Greater ELEMENT ===================
// // ======================= PREVIOUS GREATER ELEMENT ===================

    public int[] previousGreaterElement(int[] arr, int[] res, Day5Stacks stk) {

        for (int i = 0; i < arr.length; i++) {
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

// // ======================= PREVIOUS GREATER ELEMENT ===================
// // ======================= NEXT SMALLER ELEMENT ===================
    public int[] nextSmallerElement(int[] arr, int[] res, Day5Stacks stk) {

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stk.isEmpty()) {
                if (stk.peek() < arr[i]) {
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
// // ======================= NEXT SMALLER ELEMENT ===================

// // ======================= Previous SMALLER ELEMENT ===================
    public int[] previousSmallerElement(int[] arr, int[] res, Day5Stacks stk) {
        for (int i = 0; i < arr.length; i++) {
            while (!stk.isEmpty()) {
                if (stk.peek() < arr[i]) {
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
// // ======================= PREVIOUS SMALLER ELEMENT ===================

// // ======================= Previous SMALLER INDEX ===================
    public int[] previousSmallerIndex(int[] arr, int[] res, Day5Stacks stk) {
        stk.clearStack();

        for (int i = 0; i < arr.length; i++) {
            while (!stk.isEmpty()) {
                if (arr[stk.peek()] < arr[i]) {
                    res[i] = stk.peek();
                    break;
                } else {
                    stk.pop();
                }
            }
            stk.push(i);
        }
        return res;
    }
// // ======================= PREVIOUS SMALLER INDEX ===================

// // ======================= Next SMALLER INDEX ===================
    public int[] nextSmallerIndex(int[] arr, int[] res, Day5Stacks stk) {
        stk.clearStack();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stk.isEmpty()) {
                if (arr[stk.peek()] < arr[i]) {  // 1
                    res[i] = stk.peek();
                    break;
                } else {
                    stk.pop();
                }
            }
            stk.push(i);                         // 2
        }
        return res;
    }
// // ======================= NEXT SMALLER INDEX ===================

    public static void main(String[] args) {
        Day5Stacks stk = new Day5Stacks(5);

        int[] arr = {4, 5, 2, 10, 8};
        // int[] arr = {2, 4};
        int[] leftRes = new int[arr.length];   // []
        int[] rightRes = new int[arr.length];

        Arrays.fill(leftRes, -1);
        Arrays.fill(rightRes, arr.length);
        // res = stk.nextGreaterElement(arr, res, stk);
        // res = stk.previousGreaterElement(arr, res, stk);
        // res = stk.nextSmallerElement(arr, res, stk);
        // res = stk.previousSmallerElement(arr, res, stk);
        leftRes = stk.previousSmallerIndex(arr, leftRes, stk);
        rightRes = stk.nextSmallerIndex(arr, rightRes, stk);

        // for (int val : leftRes) {
        //     System.out.print(val + " ");
        // }
        // System.out.println();
        // for (int val : rightRes) {
        //     System.out.print(val + " ");
        // }
        // System.out.println();
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int window = rightRes[i] - leftRes[i] - 1;
            int area = arr[i] * window;
            maxArea = Math.max(area, maxArea);
        }

        System.out.println(maxArea);

    }

}
