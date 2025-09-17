import java.util.*;

class FirstFunction {
    public static int getGreater(int a, int b) {
        if( a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int greater = getGreater(a, b);
        System.out.println("Greater one is : "+ greater);
    }
}