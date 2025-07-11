import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Printing the Sum of N number :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int sum = 1;

        for(int i = 1; i <= n; i++) {

            sum = sum * i;
            //System.out.print(sum);
        }
        System.out.println("Sum of N : " + sum);

        System.out.println("\nThank you :)\n");
    }
}