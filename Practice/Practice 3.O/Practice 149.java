import java.util.*;

class FirstClass {
    public static void main(String args[]) {

    System.out.println("Finding Remainder :- \n");

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st Value : ");
    float a = sc.nextFloat();

    System.out.print("Enter 2nd value : ");
    float b = sc.nextFloat();

    float mod = a%b;
    System.out.println("\nTheir Remainder is : " + mod);
    }
}