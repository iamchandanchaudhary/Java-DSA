import java.util.*;

class ReverseNumber {
    public static void main(String args[]) {
        System.out.println("Reverse Number :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        System.out.print("Reverse Number : ");
        while(number > 0) {

            int reverse = number % 10;
            System.out.print(reverse);
            number = number/10;
        }

    }
}