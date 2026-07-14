
import java.util.Arrays;
import java.util.Stack;

public class Day5Stacks {

    // ================ VALID PARENTHESES ==============================
    public static boolean validParentheses(String s) {
        return true;
    }

    // ================ VALID PARENTHESES ==============================
// ================ Next Smaller Element ==============================
    public static int[] nextSmallerIndex(int[] arr, int[] res) {
        Stack<Integer> stk = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
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
// ================ Next Smaller Element ==============================
// ================ Previous Smaller Element ==============================

    public static int[] previousSmallerIndex(int[] arr, int[] res) {
        Stack<Integer> stk = new Stack<>();

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
// ================ Previous Smaller Element ==============================
// ================ Next Greater Element ==============================

    public static int[] nextGreaterElement(int[] arr, int[] res) {
        Stack<Integer> stk = new Stack<>();

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
// ================ Next Greater Element ==============================

    public static void main(String[] args) {
        // String s = "(())";

        // System.out.println(validParentheses(s));
        // int[] arr = {4, 5, 2, 10, 8};
        int[] arr = {4, 4, 4, 4, 4};
        int n = arr.length;
        // int[] res = new int[arr.length];

        // Arrays.fill(res, -1);
        // // res = nextGreaterElement(arr, res);
        // for (int val : res) {
        //     System.out.print(val + " ");
        // }
// ================ Largest Rectangle in Histogram ==============================
        int[] previousSmaller = new int[n];
        int[] nextSmaller = new int[n];

        Arrays.fill(previousSmaller, -1);
        Arrays.fill(nextSmaller, n);

        nextSmaller = nextSmallerIndex(arr, nextSmaller);
        previousSmaller = previousSmallerIndex(arr, previousSmaller);

        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {

            int window = nextSmaller[i] - previousSmaller[i] - 1;
            int currentArea = arr[i] * window;

            maxArea = Math.max(currentArea, maxArea);
        }

        System.out.println(maxArea);

// ================ Largest Rectangle in Histogram ==============================
    }
}
