import java.util.*;

class FirstString {
    public static void main(String args[]) {
        System.out.println("Taking input as a String:- \n");

        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);
    }
}