import java.util.*;

class FirstFunction {

    public static int calculateMultiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String args[]) {

        System.out.println("Multipication with Function :- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Value : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Value : ");
        int b = sc.nextInt();

        int mul = calculateMultiply(a, b);
        System.out.println("\nTheir Multiply : " + mul);
    }
}