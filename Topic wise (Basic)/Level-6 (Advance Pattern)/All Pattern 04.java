import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Pattern Program 04:- \n");

        int num = 5;

        // ==> 0-1 Triangle
        // System.out.println("0-1 Triangle: ");
        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         if(j % 2 == 0) {
        //             System.out.print("0 ");
        //         } else {
        //             System.out.print("1 ");
        //         }
        //     }
        //     System.out.println("  ");
        // }

        // ==> BUTTERFLY pattern
        System.out.println("BUTTERFLY pattern: ");
        // 1st Half
        for(int i = 1; i <= num; i++) {
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

        // 2nd Half
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