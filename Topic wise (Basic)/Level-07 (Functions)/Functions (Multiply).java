import java.util.*;

class FirstFunction {
    public static int printMultiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = printMultiply(a, b);
        System.out.println("Product of 2 numbers: " + mul);
    }
}