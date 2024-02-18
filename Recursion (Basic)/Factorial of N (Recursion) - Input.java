import java.util.*;

class Recursion {
    public static void printFactorial(int i, int n, int facto) {
        if(i == n) {
            facto *= i;
            System.out.println("\nFactorial of N : " + facto);
            return;
        }
        facto *= i;
        printFactorial(i+1, n, facto);
    }
    public static void main(String args[]) {
        System.out.println("Find the Factorial of N (Recursion) :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        printFactorial(1, n, 1);

        System.out.println("Thank You :)\n");
    }
}