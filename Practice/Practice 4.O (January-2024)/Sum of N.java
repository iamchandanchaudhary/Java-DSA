import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int number = 0;

        for(int i = 0; i <= n; i++) {
            number = number + i;
        }
        System.out.println("Sum of First N : " + number);
    }
}