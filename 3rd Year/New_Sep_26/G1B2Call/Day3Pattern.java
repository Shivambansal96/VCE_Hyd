
import java.util.Scanner;

public class Day3Pattern {

    public static void main(String[] args) {
        // System.out.println("Hello");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();

        System.out.println();

        // int[] arr = {8, 6, 4, 2, 9};
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {
        //             // System.out.print("(" + (i + 1) + ", " + (j + 1) + ") ");
        //             // System.out.print("*");
        //             System.out.print(arr[j] + " ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // ================================================= //
        // for(int i = 0; i < n; i++) {
        //     for(int space = i+1; space < n; space++) {
        //         System.out.print(" ");
        //     }
        //     for(int stars = 0; stars <= i; stars++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // ======================================================== //
        // for(int i = 0; i < n; i++) {
        //     for(int space = i+1; space < n; space++) {
        //         System.out.print("  ");
        //     }
        //     for(int stars = 0; stars < ((2*(i+1)) -1); stars++) {
        //         // System.out.print((stars + 1) + " ");
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // ======================================================== //
        // for (int i = 0; i < n; i++) {
        //     for (int space = i + 1; space < n; space++) {
        //         System.out.print("  ");
        //     }
        //     for (int stars = 0; stars <= i; stars++) {
        //         System.out.print(stars+1 + " ");
        //     }
        //     for (int col = i; col > 0; col--) {
        //         System.out.print((col) + " ");
        //     }
        //     System.out.println();
        // }
        // ======================================================== //
        // for(int i = 0; i < n; i++) {
        //     for(int spaces = 0; spaces < i; spaces++) {
        //         System.out.print(" ");
        //     }
        //     for(int stars = n-1; stars >= i; stars--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // // ======================================================== //
        // for (int i = 0; i < n-1; i++) {
        //     for (int space = i + 1; space < n; space++) {
        //         System.out.print(" ");
        //     }
        //     for (int stars = 0; stars <= i; stars++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int spaces = 0; spaces < i; spaces++) {
        //         System.out.print(" ");
        //     }
        //     for (int stars = n - 1; stars >= i; stars--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // ======================================================== //
        // for (int i = 0; i < n; i++) {
        //     for (int spaces = 0; spaces < i; spaces++) {
        //         System.out.print(" ");
        //     }
        //     for (int stars = n - 1; stars >= i; stars--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0 + 1; i < n; i++) {
        //     for (int space = i + 1; space < n; space++) {
        //         System.out.print(" ");
        //     }
        //     for (int stars = 0; stars <= i; stars++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("=======================");
        // ======================================================== //
        for (int i = 0; i < (n/2)+1; i++) {
            for (int space = i; space < (n/2); space++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars <= i; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < (n/2); i++) {
            for (int spaces = 0; spaces <= i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = (n/2) - 1; stars >= i; stars--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // ======================================================== //
        // for (int i = 0; i < n; i++) {

        //     for (int space = i; space < n - 1; space++) {
        //         System.out.print(" ");
        //     }


        //     int count = n-i;

        //     while(count <= n) {
                


        //         count++;

        //     }







        //     if (i == n - 1) {
        //         for (int stars = 0; stars < ((2 * n) - 1); stars++) {
        //             System.out.print("*");
        //         }
        //     }

        //     System.out.println();

        // }

    }
}
