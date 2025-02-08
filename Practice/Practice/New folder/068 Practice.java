import java.util.*;

class FirstFactorial {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;

        for(int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of this no. : "+ factorial);
    }
}