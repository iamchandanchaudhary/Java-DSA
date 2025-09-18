import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Table of N:- \n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for( int i = 1; i <= 10; i++ ) {
            System.out.println(i*n);
        }
    }
}