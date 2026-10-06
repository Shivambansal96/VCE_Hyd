
import java.util.Arrays;

public class Day8Trees {
    // ======================================================================================================== //
    // ======================================================================================================== //
    // ========================= LeetCode Q32 (Longest Valid Parentheses) ==================================== //
    // ========================= LeetCode Q98 (Validate a BST) ================================================ //
    // ========================= LeetCode Q509 (Fibonacci Number) ============================================== //
    // ======================================================================================================== //
    // ======================================================================================================== //

    public static int fibMemoization(int n, int[] dp) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fibMemoization(n - 1, dp) + fibMemoization(n - 2, dp); //  2 + 1 = 3

        return dp[n];
    }

    public static int fibTabulation(int n, int[] dp) {

        if (n == 0 || n == 1) {
            return n;
        }

        dp[0] = 0;   // arr = {1, 1, 2, 3, 5, 8} arr = {0, 1, 1, 2, 3, 5};
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
                dp[i] = dp[i-1] + dp[i -2];

        }

        return dp[n];
        
}


        // if (dp[n] != -1) {
        //     return dp[n];
        // }

        // dp[n] = fibMemoization(n - 1, dp) + fibMemoization(n - 2, dp); //  2 + 1 = 3

        // return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);
        int ans = fibTabulation(n, dp);
        System.out.print(ans);
    }

}
