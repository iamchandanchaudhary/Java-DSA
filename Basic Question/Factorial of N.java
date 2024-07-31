import java.util.*;

class Factorial {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt(); 
        int facto = 1;

        for(int i = 1; i <= n; i++) {
            facto *= i;
        }
        System.out.println("Factorial of N : " + facto);
    }
}