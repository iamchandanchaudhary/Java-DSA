import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Pattern Program 03:- \n");

        int num = 5;

        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println("  ");
        // }

        // for(int i = 1; i <= num; i++) {
        //     for(int j = num; j >= 1; j--) {
        //         if(i == j || i < j) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println("  ");
        // }

        // for(int i = 1; i <= num; i++) {
        //     for(int j = num; j >= 1; j--) {
        //         if(i == j || i > j) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println("  ");
        // }

        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= num; j++) {
        //         if(i == j || i < j) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println("  ");
        // }

        // ==> Two upper half pyramid
        // System.out.println("Two upper half pyramid: ");
        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }

        //     for(int j = 1; j <= 2*(num-i); j++) {
        //         System.out.print("  ");
        //     }

        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // ==> Two down half pyramid
        System.out.println("Two down half pyramid: ");
        for(int i = num; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for(int j = 1; j <= 2*(num-i); j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}