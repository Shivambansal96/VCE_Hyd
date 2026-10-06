
// import java.util.Arrays;
// import java.util.Comparator;
// public class Day9DP {
//     // ======================================================================================================== //
//     // ======================================================================================================== //
//     // ========================= LeetCode Q70 (Climbing Stairs) ================================================ //
//     // ========================= LeetCode Q198 (House Robber) ================================================== //
//     // ========================= LeetCode Q213 (House Robber II) =============================================== //
//     // ========================= LeetCode Q322 (Coin Change) =================================================== //
//     // ======================================================================================================== //
//     // ======================================================================================================== //
//     public static void main(String[] args) {
//         Comparator<int[]> rC = (a, b) -> {
//             double ratioA = (double) a[0] / a[1];
//             double ratioB = (double) b[0] / b[1];
//             return Double.compare(ratioB, ratioA);
//         };
//         int[][] arr = {
//             {60, 10},
//             {100, 20},
//             {120, 30},
//             {80, 40},
//             {150, 15}
//         };
//         int capacity = 60;
//         int ans = 0;
//         Arrays.sort(arr, rC);
//         for(int[] item: arr) {
//             int val = item[0];
//             int weight = item[1];
//             if(weight <= capacity) {
//                 ans += val;
//                 capacity -= weight;
//             }
//             else{
//                 ans += (double) (val / weight) * capacity;
//                 capacity = 0;
//             }
//         }
//         System.out.println(ans+ "cw");
//     }
//     public void fractionalKnapsack() {
//         Comparator<int[]> ratioComparator = (a, b) -> {
//             double ratioA = (double) a[0] / a[1];
//             double ratioB = (double) b[0] / b[1];
//             return Double.compare(ratioB, ratioA);
//         };
//         // ArrayList<Integer> arr = new ArrayList<>();
//         // arr.add(60, 10);
//         // arr.add(100, 20);
//         // arr.add(120, 30);
//         // arr.add(80, 40);
//         // arr.add(150, 15);
//         int[][] arr = {
//             {60, 10},
//             {100, 20},
//             {120, 30},
//             {80, 40},
//             {150, 15}
//         };
//         int capacity = 60;
//         int res = 0;
//         Arrays.sort(arr, ratioComparator);
//         for (int[] arr1 : arr) {
//             int val = arr1[0];
//             int weight = arr1[1];
//             // ratio.add(val / weight);
//             if (weight <= capacity) {
//                 capacity -= weight;
//                 res += val;
//             } else {
//                 res += (double) (val / weight) * capacity;
//                 // capacity = 0;
//                 break;
//             }
//         }
//         System.out.println(res);
//     }
// }
class Day9DP {

    public int coinChange(int[] coins, int amount) {
        // if(amount == 0) return 0;
        // if(coins.length == 1 && coins[0] < amount) return -1; // 

        // int c = 0; 
        // for(int i = coins.length - 1; i >= 0; i--) {
        //     if(coins[i] <= amount) {
        //         c += (amount / coins[i]); // 2 + 1 = 3
        //         // amount -= (coins[i] * c); // remainingBalance = 0
        //         amount %= (coins[i] * c);  // 1 % 1 = 0
        //         System.out.print(amount + " ");
        //     }
        //     if(amount == 0)  return c;     
        // }
        // return -1;   
        if (coins.length == 1 && amount > coins[0]) {
            return -1;
        }
        int c = 0;
        int remainingAmount = amount;
        for (int i = coins.length - 1; i >= 0; i--) {

            while (coins[i] <= remainingAmount) {
                c++;
                remainingAmount -= coins[i];
            }
        }
        return c;

    }
}
