
import java.util.HashMap;

public class Day6TwoPointers {

    public static boolean palindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2, int[] res) {

        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[idx] = arr1[i];
                i++;
            } else {
                res[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        while (i < arr1.length) {
            res[idx] = arr1[i];
            i++;
            idx++;
        }

        while (j < arr2.length) {
            res[idx] = arr2[j];
            j++;
            idx++;
        }

        return res;
    }

    public static void removeDuplicates(int[] arr) {
        // int[] arr = {2, 2, 2, 4, 4, 5, 5};
        int slow = 0;
        int fast = 1;

        while (fast < arr.length) {
            if (arr[slow] == arr[fast]) {
                fast++;
            } else {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int lSS(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int slow = 0;
        int longestSubStr = 0;
        for (int fast = 0; fast < s.length(); fast++) {
            if (hashMap.containsKey(s.charAt(fast))) {
                slow++;
            }
            hashMap.put(s.charAt(fast), fast);
            longestSubStr = Math.max(longestSubStr, fast - slow + 1);
        }
        return longestSubStr;
    }

    public static void main(String[] args) {

// // =============== PALINDROME ===============
        // String s = "racecar";
        // System.out.println(palindrome(s));
        // // =============== PALINDROME ===============
// // // =============== MERGE TWO SORTED ARRAYS ===============
//         int[] arr1 = {2, 5, 9, 12};
//         int[] arr2 = {4, 8, 16};
//         int[] res = new int[arr1.length + arr2.length];
//         res = mergeSortedArrays(arr1, arr2, res);
//         for (int val : res) {
//             System.out.print(val + " ");
//         }
// // // =============== MERGE TWO SORTED ARRAYS ===============
// // // =============== Remove Duplicates ===============
//         int[] arr = {2, 2, 2, 4, 4, 5, 5};
//         Arrays.sort(arr);
//         removeDuplicates(arr);
// // // =============== Remove Duplicates ===============
// // // =============== Sliding Window ===============
// // // Q 3 - Longest Substring without repeating characters.
        String s = "aabb";
        int res = lSS(s);
        System.out.println(res);

// // // =============== Sliding Window ===============
    }
}
