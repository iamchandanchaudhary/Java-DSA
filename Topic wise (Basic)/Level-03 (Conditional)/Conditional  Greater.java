import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Finding the Greatest Number:- \n");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Value: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Value: ");
        int b = sc.nextInt();
        
        if( a == b ) {
            System.out.println("Equal");
        } 
        else if( a > b ) {
            System.out.println("a is greater");
        } else {
                System.out.println("b is greater");
        }
    }
}