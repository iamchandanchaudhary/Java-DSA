import java.util.*;

class FirstClass {
    public static int calculateFactorial(int n) {
        int factorial = 1;
        return factorial;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = calculateFactorial(n);

        for(int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of this no. : " + factorial);
    }
}