
public class Knapsack {

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
        int[] weights = {2, 3, 5, 7, 1, 4, 6};
        int[] values = {10, 5, 15, 7, 6, 18, 20};
        int capacity = 20;
        int n = 4;

        System.out.println(knapsack(weights, values, capacity)); // 9
        // knapsack(weights, values, capacity); // 9

    }
}
