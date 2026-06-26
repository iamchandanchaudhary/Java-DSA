import java.util.*;

class JavaPractice {
    public static void main(String[] args) {
        System.out.println("Find the factorial: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int facto = 1;

        for (int i = 1; i <= num; i++) {
            facto *= i;
        }

        System.out.println("Factorial of " + num + ": " + facto);

    }
}