import java.util.*;

class Recursion2 {
    public static void towerOfHanoi(int n, String scr, String helper, String dest) {
        if(n == 1) {
            System.out.println("Transfer disk " + n + " from " + scr + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, scr, dest, helper);
        System.out.println("Transfer disk " + n + " from " + scr + " to " + dest);
        towerOfHanoi(n-1, helper, scr, dest);
    }

    public static void main(String args[]) {
        System.out.println("Tower of Hanoi :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of disk : ");
        int n = sc.nextInt();

        System.out.println("\nFor " + n + " disk :-");
        towerOfHanoi(n, "S", "H", "D");

        System.out.println("\nThank you :)");
    }
}