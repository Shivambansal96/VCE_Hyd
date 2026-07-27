
public class Day1Searching {

    public static boolean binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        // // int[] arr = {1, 3, 4, 53, 7, 8, 9, 11, 123, 53, 64, 6, 53};
        // int[] arr = new int[10];
        // int count = 1;
        // for (int i = 0; i < 10; i++) {
        //     arr[i] = count * count;
        //     count++;
        // }
        // for (int val : arr) {
        //     System.out.print(val + " ");
        // }
// // ====================================================================
//         int[] arr = {2, 5, 9, 12, 18, 22, 34};
//         int target = 340;
//         boolean flag = false;
//         int i = 0;
//         for (i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 flag = true;
//             }
//         }
//         System.out.println(flag ? "Target Found at index = " + i : "Target NOT Found");
// // ====================================================================
        int[] arr = {2, 5, 9, 12, 18, 22, 34};
        int target = 120;

        System.out.println(binarySearch(arr, target) ? "Target Found" : "Target NOT Found");
// // ====================================================================
    }
}
