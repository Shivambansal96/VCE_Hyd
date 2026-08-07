
import java.util.Arrays;

public class Day11DP {

    public static int recursionFib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return recursionFib(n - 1) + recursionFib(n - 2);

    }

    public static int memoizationFib(int n, int[] arr) {

        if (n <= 1) {
            return n;
        }

        if (arr[n] != -1) {
            return arr[n];
        }

        arr[n] = memoizationFib(n - 1, arr) + memoizationFib(n - 2, arr);
        return arr[n];
    }

    public static int tabulationFib(int n, int[] arr) {

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static int spaceOptimizationFib(int n) {

        int prev1 = 0;
        int prev = 1;
        int current = 0;

        for (int i = 2; i < n + 1; i++) {
            current = prev + prev1;
            prev1 = prev;
            prev = current;

        }

        return current;
    }

    public static void main(String[] args) {

        int n = 6;
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        // System.out.println("Normal Recursion Fibonacci = " + recursionFib(n));
        // System.out.println("Memoization Fibonacci = " + memoizationFib(n, arr));
        // System.out.println("Tabulation Fibonacci = " + tabulationFib(n, arr));
        System.out.println("Space Optimization Fibonacci = " + spaceOptimizationFib(n));

    }

}
