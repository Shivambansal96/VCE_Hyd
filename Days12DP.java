
import java.util.Arrays;

public class Days12DP {

    public static int recursionFib(int n) {

        if (n <= 1) {
            return n;
        }

        return recursionFib(n - 2) + recursionFib(n - 1);
    }

    public static int memoizationFib(int n, int[] arr) {

        if (n <= 1) {
            return n;    // Base Case
        }

        if (arr[n] != -1) {
            return arr[n];  // Already stored values are returned.
        }

        // Storing the values using recursive case;
        arr[n] = memoizationFib(n - 1, arr) + memoizationFib(n - 2, arr);

        return arr[n];
    }

    public static int tabulationFib(int n, int[] arr) {

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
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

    public static int factorialTabulationDP(int n, int[] arr) {

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i * arr[i - 1];
        }

        return arr[n];
    }

    public static int knapsack(int[] weights, int[] values, int capacity) {
        int[] dp = new int[capacity + 1];
        for (int i = 0; i < weights.length; i++) {
            for (int w = capacity; w >= weights[i]; w--) {
                dp[w] = Math.max(dp[w], values[i] + dp[w - weights[i]]);
            }
        }
        return dp[capacity];
    }

    public static void main(String[] args) {

        int n = 5;

        int[] arr = new int[n + 1];

        Arrays.fill(arr, -1);

        System.out.println("Normal Recursion = " + recursionFib(n));
        System.out.println("Memoization = " + memoizationFib(n, arr));
        System.out.println("Tabulation = " + tabulationFib(n, arr));
        System.out.println("Space Optimization = " + spaceOptimizationFib(n));

        System.out.println("Factorial = " + factorialTabulationDP(n, arr));


//  ============================= KnapSack ===============================

        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int capacity = 7;

        System.out.println(knapsack(weights, values, capacity)); // 9

    }
}
