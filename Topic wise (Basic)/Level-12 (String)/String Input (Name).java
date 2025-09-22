import java.util.*;

class FirstString {
    public static void main(String args[]) {

        System.out.print("Enter first name : ");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();

        System.out.print("Enter last name : ");
        String lastName = sc.nextLine();

        String fullNmae = firstName + " " + lastName;

        System.out.print("Your full name is : ");
        System.out.println(fullNmae);
    }
}