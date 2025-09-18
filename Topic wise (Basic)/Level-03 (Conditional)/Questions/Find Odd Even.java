import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Odd or Even Number:- \n");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int age = sc.nextInt();

        if (age % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}