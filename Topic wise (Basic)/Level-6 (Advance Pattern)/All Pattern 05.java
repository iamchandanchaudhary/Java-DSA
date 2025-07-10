import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Pattern Program 05:- \n");

        final int num = 5;

        for(int i = 1; i <= num; i++) {
            for(int j = num; j >= 1; j--) {
                if(i == j || i > j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}