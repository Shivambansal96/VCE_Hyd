
import java.util.Arrays;
import java.util.Stack;

public class Demo {

    public static int[] leftSmallestElement(Stack<Integer> stk, int[] arr, int[] res) {

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

    public static int[] rightSmallestElement(Stack<Integer> stk, int[] arr, int[] res) {

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

    public static void main(String[] args) {
        Stack<Integer> leftStk = new Stack<>();
        Stack<Integer> rightStk = new Stack<>();

        // int[] arr = {2, 1, 5, 6, 2, 3};
        int[] arr = {2, 2, 2, 2, 2};

        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        left = leftSmallestElement(leftStk, arr, left);
        right = rightSmallestElement(rightStk, arr, right);
        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {
            int width = right[i] - left[i] - 1;
            int currentArea = arr[i] * width;
            maxArea = Math.max(currentArea, maxArea);
        }

        System.out.println(maxArea);

    }
}





