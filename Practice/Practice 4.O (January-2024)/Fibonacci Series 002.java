import java.util.*;

class Recursion {
    public static void printFib(int a, int b, int fib) {
        if(fib == 1) {
            return;
        }
        int c = a + b;
        System.out.println(c);

        printFib(b, c, fib-1);
    }
    public static void main(String args[]) {

        System.out.println("Fibonacci Series :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter series Number : ");
        int fib = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("\nFibonacci Series of " + fib + " is :- \n" + a + "\n" + b);

        printFib(a, b, fib-2);

        System.out.println("Thank You :)\n");
    }
}