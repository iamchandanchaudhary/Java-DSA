import java.util.*;

class Power {
    public static void main(String args[]) {
        System.out.println("Find Square of a Number :- \n");
        
        Scanner sc = new Scanner(System.in);
        // Value
        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        // Power
        System.out.print("Enter Power : ");
        int power = sc.nextInt();

        int ans = 1;

        for(int i = 1; i <= power; i++) {

            ans = ans * number;
        }
        System.out.println("\nPower " + number + "^" + power +" is : " + ans);

        System.out.println("Thank You :)\n");
    }
}