import java.util.*;

class Operators {
    public static void main(String args[]) {
        System.out.println("Arithmetic Operators:- \n");

        System.out.print("Enter 1st digit : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter 2nd digit : ");
        int b = sc.nextInt();
        
        // ==> Binary Operators
        System.out.println("\nBinary Operators:-");

        // Addition
        int add = a + b;
        System.out.println("Addition: " + add);

        // Subtraction
        int min = a - b;
        System.out.println("Subtraction: " + min);

        // Multiply
        int mul = a * b;
        System.out.println("Multiply: " + mul);

        // Division
        int div = a / b;
        System.out.println("Division: " + div);

        // modulo
        int mod = a % b;
        System.out.println("Remainder: " + mod);

        // ==> Unary Operators
        System.out.println("\nUnary Operators:-");

        int increment = ++a;
        System.out.println("Intrement: " + increment);

        int decrement = --b;
        System.out.println("Decrement: " + decrement);
    }
}