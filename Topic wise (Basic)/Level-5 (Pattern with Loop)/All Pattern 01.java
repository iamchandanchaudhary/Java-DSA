import java.util.*;

class Main {
    public static void main(String[] args) {

        int num = 5;

        // ==> Square Pattern
        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= num; j++) {
        //         System.out.print("* ");
        //     }
        // System.out.println();
        // }

        // ==> Hollow Rectangle
        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= num; j++) {
        //         if(i == num || i == 1 || j == num || j == 1) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        // System.out.println();
        // }

        // ==> Lower half pyramid
        // for(int i = 1; i <= num; i++) {
        //     for(int j = i; j <= num; j++) {
        //         System.out.print("* ");
        //     }
        // System.out.println();
        // }

        // ==> Upper half pyramid
        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        // System.out.println();
        // }

        // ==> Upper half same number pyramid
        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(i + " ");
        //     }
        // System.out.println();
        // }

        // ==> Upper half different number pyramid
        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        // System.out.println();
        // }

        // ==> Upper half different asscending number pyramid
        int n = 0;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                n += 1;
                System.out.print(n + " ");
            }
        System.out.println();
        }
    }
}