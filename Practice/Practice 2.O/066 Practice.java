import java.util.*;

class FirstClass {
    public static int calculateMultiply(int a, int b) {
        int mul = a * b;
        return mul;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = calculateMultiply(a, b);
        System.out.println("Product of these no. : " + mul);
    }
}