import java.util.*;

class PalindromeNumber {
    public static void main(String args[]) {
        System.out.println("Check Number Palindrome or Not :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        int reverse, c = number, s = 0; 

        System.out.print("Reverse Number : ");
        while(number > 0) {

            reverse = number % 10;
            s = (s*10) + reverse;
            //System.out.print(reverse);
            //System.out.print(s + " ");
            number = number/10;

        }
        // System.out.println(c);
        // System.out.println(number);
        if(s == c) {
            System.out.println("This is a Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}