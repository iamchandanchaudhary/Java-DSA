import java.util.*;

class Calculator {
    public static void main(String args[]) {

        System.out.println("Calculator :- \n");

        Scanner sc = new Scanner(System.in);

        for(int i = 1; ; i++) {

        // taking Input ==> values & Operators
        System.out.print("Enter 1st Value : ");
        float firstValue = sc.nextFloat();

        System.out.print("Enter Operator(+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter 2nd Value : ");
        float secondValue = sc.nextFloat();

        System.out.println();

        // Making Conditions According to Operator(+,-,*,/,%)
        if(operator == '+') {
            //System.out.print();
            System.out.println("Their Sum : " + (firstValue + secondValue));
        }
        else if(operator == '-') {
            //System.out.print();
            System.out.println("Their Substraction : " + (firstValue - secondValue));
        }
        else if(operator == '*') {
            //System.out.print("Their Multipication :");
            System.out.println("Their Multipication : " + (firstValue * secondValue));
        }
        else if(operator == '/') {
            System.out.println("Their Division : " + (firstValue / secondValue));
        }
        else if(operator == '%') {
            System.out.println("Their Remainder : " + (firstValue % secondValue));
        }
        else {
            System.out.println("Invalid Operator :(");
        }

        System.out.println("Thank You :)\n");

    }
    }
}