import java.util.*;

class FirstFunction {
    public static int printSum(int a, int b) {
        int sum = a + b;
        System.out.println("\nSum is : " + sum);
        return 1;
    }

    public static void main(String args[]) {

        System.out.println("Addition with Function :- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Value : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Value : ");
        int b = sc.nextInt();

        printSum(a, b);
    }
}