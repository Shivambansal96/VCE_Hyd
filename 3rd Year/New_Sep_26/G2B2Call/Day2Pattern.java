
import java.util.Scanner;

public class Day2Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Pattern for " + n + " rows: ");

        //  =================================== //
        // // // Pattern 2 // // //
        //  =================================== //
        // for (int i = 0; i < n; i++) {
        //     for (int j = n - 1; j >= i; j--) {
        //         // System.out.print("*  ");
        //         // System.out.print((i+1) + " ");
        //         System.out.print((j+1) + " ");
        //     }
        //     System.out.println();
        // }
        // for(int i = n-1; i >=0; i--) {
        //     for(int j = i; j >= 0; j--) {
        //         // System.out.print((i+1)*(j+1) + " ");
        //     }
        //     System.out.println();
        // }
        //  =================================== //
        // // // HOLLOW RECTANGLE Pattern  // // //
        //  =================================== //
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if(i == 0 || j == 0 || i == n - 1 || j == n - 1)
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        //  =================================== //
        // // // Pattern 3 // // //
        //  =================================== //
        for(int i = 0; i < n; i++) {
            for(int spaces = n-1; spaces > i; spaces--) {
                System.out.print(" ");
            }
            for(int stars = 0; stars <= i ; stars++) {
                System.out.print("* ");
                // System.out.print(i);
                // System.out.print(j);
            }
            System.out.println();
        }
        //  =================================== //
        // // // PYRAMID Pattern // // //
        //  =================================== //
        // for (int i = 0; i < n; i++) {

        //     for (int spaces = n - 1; spaces > i; spaces--) {
        //         System.out.print(" ");
        //     }

        //     for (int stars = 0; stars < (2 * i) + 1; stars++) {
        //         System.out.print("* ");
        //         // System.out.print(i+1 +  " ");
        //         // System.out.print(stars + 1 + " ");
        //     }

        //     System.out.println();

        // }

        //  =================================== //
        // // // Pattern 4 // // //
        //  =================================== //
        for(int i = 0; i < n; i++) {

            for(int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");
            }

            for(int stars = n-1; stars >= i ; stars--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
