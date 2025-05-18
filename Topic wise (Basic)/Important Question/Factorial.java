import java.util.*;

class Factorial {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int number = 1;

        for(int i = 1; i <= n; i++) {
            number = number * i;
        }
        System.out.println("Factorial : " + number);
    }
}