import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("If Elase Condition:- \n");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}