import java.util.*;

class FirstStrings {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

    }
}