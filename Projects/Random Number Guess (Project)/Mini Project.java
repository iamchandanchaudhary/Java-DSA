import java.util.*;

class Project {
    public static void main(String args[]) {
        System.out.println("Let's play a Game --> Guess a Number & I'll check it match with my Number or Not :- ");
        System.out.println("[Note :- if you couldn't find the number simply enter any Negative(-) number The program will automatically show The actual Number.]");

        Scanner sc = new Scanner(System.in);
        int mainNumber = 45;

        for(int i = 1; ; i++) {


        System.out.print("\nGuess your Number : ");
        int userNumber = sc.nextInt();

        if(userNumber < 0) {
            break;
        }

        if(mainNumber == userNumber) {
            System.out.println("WOW :) \nYou Guessed Correct Number");
            break;
        } else {
            System.out.println("Wrong Guess :(\nTry again");
        }
    }

    System.out.println("Number is : " + mainNumber);
    System.out.println("Thank You :)");
    }
}