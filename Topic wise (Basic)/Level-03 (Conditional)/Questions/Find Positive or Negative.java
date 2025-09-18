import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Find Positive or Negative:- \n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
        if( num > 0 ) {
            System.out.println("Positive Number");
        } 
        else if( num < 0 ) {
            System.out.println("Negative Number");
        } else {
            System.out.println("0 is neither a positive nor a negative number.");
        }
    }
}