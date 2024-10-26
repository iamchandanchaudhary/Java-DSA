import java.util.*;

class Main {
    public static void main(String args[]) {
        System.out.println("Guess Random Odd or Even :- \n");

        int number = (int)(Math.random() * 100);

        System.out.println("Number is : " + number);

        if(number % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}