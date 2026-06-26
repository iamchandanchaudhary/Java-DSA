import java.util.*;

class Practice {
    public static int printSum(int a, int b) {
        
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + printSum(a, b));
    }
}