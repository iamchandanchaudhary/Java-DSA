import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Else if Condition:- \n");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
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