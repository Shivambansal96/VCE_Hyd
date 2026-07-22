
import java.util.ArrayDeque;
import java.util.Deque;

public class Demo {

    // public static void adaptiveCooling(int[] arr, int k) {
    //     int maxLen = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         int max = arr[i];
    //         int min = arr[i];
    //         for (int j = i; j < arr.length; j++) {
    //             max = Math.max(max, arr[j]);
    //             min = Math.min(min, arr[j]);
    //             if (max - min <= k) {
    //                 int window = j - i + 1;
    //                 maxLen = Math.max(maxLen, window);
    //             }
    //         }
    //     }
    //     System.out.println(maxLen);
    // }
    public static void adaptiveCooling(int[] arr, int K) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        int left = 0;
        int ans = 0;
        int N = arr.length;

        for (int right = 0; right < N; right++) {

            while (!maxDeque.isEmpty() && arr[maxDeque.peekLast()] <= arr[right]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(right);

            while (!minDeque.isEmpty() && arr[minDeque.peekLast()] >= arr[right]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(right);

            while (arr[maxDeque.peekFirst()] - arr[minDeque.peekFirst()] > K) {

                if (maxDeque.peekFirst() == left) {
                    maxDeque.pollFirst();
                }

                if (minDeque.peekFirst() == left) {
                    minDeque.pollFirst();
                }

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {

        int[] arr = {10, 12, 15, 11, 14, 18, 19, 13};

        int k = 4;

        adaptiveCooling(arr, k);

    }
}
