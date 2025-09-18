import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Sum of N terms:- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int sum = 0;
        for( int i = 0; i <= num; i++ ) {
            sum = sum + i;
        } 
        System.out.println(sum);
    }
}