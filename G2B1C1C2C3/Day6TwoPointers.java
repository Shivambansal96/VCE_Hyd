
import java.util.Arrays;
import java.util.HashSet;

public class Day6TwoPointers {

    public static boolean palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int[] mergeTwoSortedArrays(int[] arr, int[] arr2, int[] res) {

        int i = 0;
        int j = 0;
        int resIndex = 0;

        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                res[resIndex] = arr[i];
                i++;
            } else {
                res[resIndex] = arr2[j];
                j++;
            }
            resIndex++;
        }

        while (i < arr.length) {
            res[resIndex] = arr[i];
            i++;
        }

        while (j < arr2.length) {
            res[resIndex] = arr2[j];
            j++;
        }
        return res;
    }

    public static void removeDuplicates(int[] arr) {
        Arrays.sort(arr);

        int i = 0;

        while (i < arr.length) {
            System.out.print(arr[i] + " ");

            int j = i + 1;
            while (j < arr.length && arr[i] == arr[j]) {
                j++;
            }
            i = j;
        }

    }

    public static void maxAvgSubArray(int[] arr, int k) {
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        float maxSum = currentSum;
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i];
            currentSum -= arr[i - k];

            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println("Max Average = " + maxSum / k);

    }

    public static void maxNumberOfVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u') {
                count++;
            }
            if (i >= k && (s.charAt(i - k) == 'a' || s.charAt(i - k) == 'o' || s.charAt(i - k) == 'e' || s.charAt(i - k) == 'i' || s.charAt(i - k) == 'u')) {
                count--;
            }
            maxCount = Math.max(count, maxCount);
        }

        System.out.println(maxCount);
    }

    public static void longestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (hashSet.contains(s.charAt(right))) {
                hashSet.remove(s.charAt(left));
                left ++;
            }
            hashSet.add(s.charAt(right));
            int window = right - left + 1;
            maxLen = Math.max(maxLen, window);
        }
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        // String s = "racecar";
        // System.out.println(palindrome(s) ? "Palindrome" : "NOT");

        // int[] arr = {2, 5, 9, 12};
        // int[] arr2 = {4, 8, 16};
        // int[] res = new int[arr.length + arr2.length];
        // res = mergeTwoSortedArrays(arr, arr2, res);
        // for (int val : res) {
        //     System.out.print(val + " ");
        // }
        // int[] arr = {2, 5, 2, 2, 5, 4};
        // removeDuplicates(arr);
        // int[] arr = {1, 12, -5, -6, 50, 3};
        // int k = 4;
        // maxAvgSubArray(arr, k);
        // String s = "abciiidef";
        // int k = 3;
        // maxNumberOfVowels(s, k);
        String s = "ab";
        longestSubstring(s);
    }
}
