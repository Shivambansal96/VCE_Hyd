
import java.util.Arrays;
import java.util.Stack;

public class Day5AStacks {

    // // ================== NEXT GREATER ELEMENT ==========================
    public static int[] nextGreaterElement(int[] arr, int[] res) {
        Stack<Integer> stk = new Stack<>();
        // int[] arr = {4, 5, 2, 10, 8};
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

    // // ================== NEXT SMALLER ELEMENT ==========================
    public static int[] nextSmallerElement(int[] arr, int[] res) {
        Stack<Integer> stk = new Stack<>();
        // int[] arr = {4, 5, 2, 10, 8};
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

    // // ================== PREVIOUS SMALLER ELEMENT ==========================
    public static int[] previousSmallerElement(int[] arr, int[] res) {
        Stack<Integer> stk = new Stack<>();
        // int[] arr = {4, 5, 2, 10, 8};
        // for (int i = arr.length - 1; i >= 0; i--) {
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

    // // ================== PREVIOUS Greater ELEMENT ==========================
    public static int[] previousGreaterElement(int[] arr, int[] res) {
        Stack<Integer> stk = new Stack<>();
        // int[] arr = {4, 5, 2, 10, 8};
        // for (int i = arr.length - 1; i >= 0; i--) {
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

    // // ================== NEXT SMALLER ELEMENT ==========================
    public static int[] nextSmallerIndex(int[] arr, int[] res) {
        Stack<Integer> stk = new Stack<>();
        // int[] arr = {4, 5, 2, 10, 8};
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

    // // ================== PREVIOUS SMALLER ELEMENT ======================
    public static int[] previousSmallerIndex(int[] arr, int[] res) {
        Stack<Integer> stk = new Stack<>();
        // int[] arr = {4, 5, 2, 10, 8};
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

    // ================ LARGEST RECTANGLE IN HISTOGRAM ===========
    public static int largestRectangle(int[] arr, int n) {

        int[] leftRes = new int[n];
        int[] rightRes = new int[n];

        Arrays.fill(leftRes, -1);
        Arrays.fill(rightRes, n);

        leftRes = previousSmallerIndex(arr, leftRes);
        rightRes = nextSmallerIndex(arr, rightRes);

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int length = arr[i];
            int breadth = rightRes[i] - leftRes[i] - 1;
            int currentArea = length * breadth;
            maxArea = Math.max(currentArea, maxArea);
        }

        return maxArea;

    }

    public static void main(String[] args) {

        // int[] arr = {4, 5, 2, 10, 8};
        // int[] res = new int[arr.length];
        // Arrays.fill(res, -1);
        // res = nextGreaterElement(arr, res);
        // res = nextSmallerElement(arr, res);
        // res = previousSmallerElement(arr, res);
        // res = previousGreaterElement(arr, res);
        // res = nextSmallerIndex(arr, res);
        // res = previousSmallerIndex(arr, res);
        // for (int val : res) {
        //     System.out.print(val + " ");
        // }
        int[] arr = {2, 1, 5, 6, 2, 3};

        int n = arr.length;

        System.out.println(largestRectangle(arr, n));

    }
}
