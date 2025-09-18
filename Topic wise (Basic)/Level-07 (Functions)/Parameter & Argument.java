import java.util.*;

class FirstFunction {
    public static int calculateSum(int a, int b) { // Parameters or fomal parameters
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        System.out.println("Parameters & Arguments:- \n");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println(sum);
    }
}