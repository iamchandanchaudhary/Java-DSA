import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Finding the Greatest of 3:- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Value: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Value: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd Value: ");
        int c = sc.nextInt();
        
        if( a > b && a > c ) {
            System.out.println("A is the Greatest Number.");
        } 
        else if( a < b && b > c ) {
            System.out.println("B is the Greatest Number.");
        } 
        else if( a == b && b == c ) {
            System.out.println("All are Equal.");
        } 
        else {
                System.out.println("C is the Greatest Number.");
        }
    }
}