
public class Day1SearchingAndSorting {

    // // ==================== LINEAR SEARCH =========================
    // public static void main(String[] args) {
    //     int[] arr = new int[10];
    //     boolean flag = false;
    //     int target = 136;
    //     for (int i = 1; i <= 10; i++) {
    //         arr[i - 1] = i * i;
    //     }
    //     // for(int val: arr)
    //     //     System.out.print(val + " ");
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             // System.out.println("Target Found at index " + i);
    //             flag = true;
    //             break;
    //         }
    //         // else {
    //         //     System.out.println("Target not Found");
    //         // }
    //     }
    //     if (flag) {
    //         System.out.println("Target Found");
    //     } else {
    //         System.out.println("Target not Found");
    //     }
    // }
    // // ==================== LINEAR SEARCH =========================
    // ==================== BINARY SEARCH =========================
    public static void main(String[] args) {

        int[] arr = new int[10];
        int target = 499;

        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = i * i;
        }

        int left = 0;
        int right = arr.length - 1;
        boolean flag = false;

        while (left <= right) {

            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (flag) {
            System.out.println("Target Found");
        } else {
            System.out.println("Target not Found");
        }

    }

    // ==================== BINARY SEARCH =========================
}
