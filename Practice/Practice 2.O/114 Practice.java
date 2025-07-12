import java.util.*;

class FirstStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        String fullName = name1 + " " + name2;

        System.out.println(fullName);
    }
}