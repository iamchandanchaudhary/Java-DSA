import java.util.*;

class Program {

    public static void reverseNumber(int num) {
        if(num == 0) {
            return;
        }

        System.out.print(num + " ");
        reverseNumber(num - 1);
    }

    public static void main(String args[]) {
        System.out.println("Reverse Number (Recursion):- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        reverseNumber(number);
    }
}