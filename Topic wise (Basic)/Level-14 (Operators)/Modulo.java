import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        System.out.print("Enter 1st digit : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter 2nd digit : ");
        int b = sc.nextInt();
        int mod = a % b;

        //modulo
        System.out.println("Solution : " + mod);
    }
}