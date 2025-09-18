import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Ternary Condition or Operators:- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        // Ternary Operator (?)
        // variable = condition ? statement1 : statement2;
        String type = (number % 2 == 0) ? "Even Number" : "Odd Number";

        System.out.println(type);
    }
}