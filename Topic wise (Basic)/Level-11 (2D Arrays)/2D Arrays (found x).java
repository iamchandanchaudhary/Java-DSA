import java.util.*;

class FirstArrays {
    public static void main(String args[]) {

        System.out.print("Enter rows no. : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.print("Enter cols no. : ");
        int cols = sc.nextInt();

        int numbers[] [] = new int[rows] [cols];

        System.out.println("Enter input no.");
        //input
        //rows
        for(int i = 0; i < rows; i++) {
            //cols
            for(int j = 0; j < cols; j++) {
                numbers [i] [j] = sc.nextInt();
            }
        }
        System.out.print("Enter your need no. : ");
        int x = sc.nextInt();

        //rows
        for(int i = 0; i < rows; i++) {
            //cols
            for(int j = 0; j < cols; j++) {
                if(numbers [i] [j] == x)
                System.out.print("x found at index : (" + i + ", " + j+")");
            }
            System.out.println();
        }
        System.out.println("Thank you!");
    }
}