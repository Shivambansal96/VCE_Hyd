
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day6TwoPointers {

// ======================== PALINDROME ============================
    public static void palindrome() {

        String original = "racecar";
        int left = 0;
        int right = original.length() - 1;
        boolean flag = true;

        while (left <= right) {
            if (original.charAt(left) != original.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

// ======================== MERGE TWO SORTED ARRAYS ============================
    public static void mergeSortedArrays() {

        int n = 4, m = 3;

        int[] arr1 = {2, 5, 9, 12};
        int[] arr2 = {4, 8, 16};

        int[] res = new int[n + m];
        int resIndex = 0;

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[resIndex] = arr1[i];
                resIndex++;
                i++;
            } else {
                res[resIndex] = arr2[j];
                resIndex++;
                j++;
            }
        }

        while (i < arr1.length) {
            res[resIndex] = arr1[i];
            resIndex++;
            i++;
        }

        while (j < arr2.length) {
            res[resIndex] = arr2[j];
            resIndex++;
            j++;
        }

        System.out.print("Sorted Array = ");
        for (int val : res) {
            System.out.print(val + " ");
        }

        System.out.println();
    }

    public static void removeDup() {

        int[] arr = {2, 5, 2, 4, 4, 2, 5};

        Arrays.sort(arr);

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void removeDuplicates() {

        int[] arr = {2, 5, 2, 4, 4, 2, 5};

        Arrays.sort(arr); // [2, 2, 2, 4, 4, 5, 5]

        ArrayList<Integer> arrList = new ArrayList<>();

        int i = 0;

        while (i < arr.length) {
            arrList.add(arr[i]);

            int j = i + 1;

            while (j < arr.length && arr[j] == arr[i]) {
                j++;
            }

            i = j;
        }

        System.out.println(arrList);
    }

    public static void maxAvgSubarray() {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int i = 0;
        int j = 0;

        int currentSum = 0;
        int maxSum = 0;

        while (j < arr.length) {
            if (j < k) {
                currentSum += arr[j];
            } else {
                currentSum += arr[j];
                currentSum -= arr[i];
                i++;

                maxSum = Math.max(currentSum, maxSum);
            }
            j++;
        }

        System.out.println(maxSum / k);

    }

    public static void longestSubstring() {
        Set<Character> set = new HashSet<>();

        String s = "abcabbcab";

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            int window = right - left + 1;
            maxLength = Math.max(window, maxLength);
        }

        System.out.println(maxLength);

    }

    public static void containerwithMostWater() {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = arr.length - 1;

        int maxWater = 0;

        while (left < right) {

            int width = right - left;
            int height = Math.min(arr[right], arr[left]);
            int currentWater = height * width;

            maxWater = Math.max(maxWater, currentWater);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }

        }

        System.out.println(maxWater);

    }

    public static void main(String[] args) {
        // palindrome();
        // mergeSortedArrays();
        // removeDuplicates();
        // removeDup();
        // maxAvgSubarray();
        // longestSubstring();
        containerwithMostWater();

    }
}
