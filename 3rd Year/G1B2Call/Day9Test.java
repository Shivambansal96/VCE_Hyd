
public class Day9Test {

    public static void evacuationBoats(int[] arr, int limit) {
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        int boats = 0;

        while (left <= right) {
            if (arr[left] + arr[right] <= limit) {
                left++;
            }
            boats++;
            right--;
        }

        System.out.println("Min boats = " + boats);

    }

    public static void adaptiveCooling(int[] arr, int k) {
        // int[] arr = {10, 12, 15, 11, 14, 18, 19, 13};

        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int max = arr[i];

            for (int j = i; j < arr.length; j++) {

                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);

                if (max - min <= k) {
                    int window = j - i + 1;
                    maxLen = Math.max(maxLen, window);
                }
            }
        }
        System.out.println(maxLen);

    }

    public static void main(String[] args) {

        // // int[] arr = {2, 3, 7, 8, 9, 11};
        // int[] arr = {1, 4, 5, 8, 9, 21, 24, 25};
        // // int limit = 11;
        // int limit = 30;
        // evacuationBoats(arr, limit);
        int[] arr = {10, 12, 15, 11, 14, 18, 19, 13};
        int k = 4;
        adaptiveCooling(arr, k);

    }

}
