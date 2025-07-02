import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Pattern Program 03:- \n");

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

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }

        for(int i = 1; i <= num; i++) {
            for(int j = num; j >= 1; j--) {
                if(i == j || i < j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }

        for(int i = 1; i <= num; i++) {
            for(int j = num; j >= 1; j--) {
                if(i == j || i > j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                if(i == j || i < j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
}