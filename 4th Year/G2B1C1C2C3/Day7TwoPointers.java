
public class Day7TwoPointers {

    public static void containerWithMostWater(int[] arr) {
        int left = 0, right = arr.length - 1;
        int maxWater = 0;

        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int currentWater = height * width;

            maxWater = Math.max(maxWater, currentWater);
            
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Maximum water Container = " + maxWater);
    }

    public static void main(String[] args) {

        // int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] arr = {1, 100, 1, 1, 1, 100};
        containerWithMostWater(arr);
    }
}
