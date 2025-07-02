import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Pattern Program 02:- \n");

        int num = 5;

        // ==> INVERTED HALF-PYRAMID
        // System.out.println("INVERTED HALF-PYRAMID: ");
        // for(int i = 1; i <= num; i++) {
        //     for(int j = num; j >= 1; j--) {
        //         if(i == j || j > i) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ==> INVERTED & ROTATED HALF-PYRAMID
        // System.out.println("INVERTED & ROTATED HALF-PYRAMID: ");
        // for(int i = 1; i <= num; i++) {
        //     for(int j = num; j >= 1; j--) {
        //         if(i == j || j < i) {
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ==> ⭐ INVERTED HALF-PYRAMID with Numbers
        System.out.println("INVERTED HALF-PYRAMID with Numbers: ");
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // ==> INVERTED & OPPOSITE HALF-PYRAMID
        // System.out.println("INVERTED & OPPOSITE HALF-PYRAMID: ");
        // for(int i = 1; i <= num; i++) {
        //     for(int j = 1; j <= num; j++) {
        //         if(i == j || j > i) {
        //             System.out.print(j + " ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // ==> INVERTED HALF-PYRAMID with Opposite Numbers
        // System.out.println("INVERTED HALF-PYRAMID with Opposite Numbers: ");
        // for(int i = 1; i <= num; i++) {
        //     for(int j = num; j >= 1; j--) {
        //         if(i == j || j > i) {
        //             System.out.print(j + " ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}