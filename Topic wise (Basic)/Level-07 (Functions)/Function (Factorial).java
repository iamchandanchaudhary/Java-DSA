import java.util.*;

class FirstFunction {
    public static int calculateFacto(int n) {
        
        // Factorial is not for negative numbers
        if(n < 0 ) {
            System.out.println("Invalid Number :(");
        return 1;
        }

        int facto = 1;

        for(int i = 1; i <= n; i++) {
            facto = facto * i;
        }
        System.out.println("Factorial is : " + facto);
        return 1;
    }
    public static void main(String args[]) {
        System.out.println("Find Factorial(with Function) :- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number : ");
        int n = sc.nextInt();

        calculateFacto(n);

        System.out.println("\nThank You :)");
    }

}