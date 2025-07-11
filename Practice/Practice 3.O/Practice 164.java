import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Arrays Inputs :- \n");

        Scanner sc = new Scanner(System.in);

        int number[] = new int[5];

        System.out.println("Enter Index Values :- ");
        //input
        for(int i = 0; i < 5; i++) {
            System.out.print(i + " Index : ");
            number[i] = sc.nextInt();

        }
        System.out.println("");
        //output
        for(int i = 0; i < 5; i++) {
            System.out.println(i + " Index is : " + number[i]);
        }

        System.out.println("\nThank you :)\n");
    }
}