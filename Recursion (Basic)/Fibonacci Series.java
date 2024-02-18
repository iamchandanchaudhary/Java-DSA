import java.util.*;

class Fibonacci {
    public static void main(String args[]) {
        System.out.println("Fibonacci Series :- \n");

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        //System.out.println(a + "\n" + b);

        System.out.print("Enter Series Number : ");
        int n = sc.nextInt();
        
        System.out.println("\nFibonacci series of " + n + " is : ");
        for(int i = 1; i <= n; i++) {
            int c = a + b;
            System.out.println(a);
            
            a = b;
            b = c;

            //int temp = a;
            //b = a;
            // c = b;
            // b = a;
        }
        //System.out.println(a);

    }
}