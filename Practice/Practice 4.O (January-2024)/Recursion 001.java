import java.util.*;

class Recursion {
    public static void printNumber(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }

    public static void main(String args[]) {
        System.out.println("Number from 1-10 :- \n");

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Condition : ");
        // int m = sc.nextInt();
        int n = 5;

        printNumber(n);
    }
}