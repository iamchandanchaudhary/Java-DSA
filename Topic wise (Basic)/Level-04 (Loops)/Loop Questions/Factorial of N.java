import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Factorial of N:- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int fact = 1;
        for( int i = 1; i <= num; i++ ) {
            fact = fact * i;
        } 
        System.out.println("Factorial of " + num + ": " + fact);
    }
}