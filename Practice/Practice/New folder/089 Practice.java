import java.util.*;

class FirstArrays {
    public static void main(String args[]) {

        System.out.print("Enter rows no. : ");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.print("Enter cols no. : ");
        int cols = sc.nextInt();

        int numbers [] [] = new int [rows] [cols];

        System.out.println("Enter no. : ");
        //input
        //rows
        for(int i = 0; i < rows; i++) {
            //cols
            for(int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        //rows
        System.out.println("Your output : ");
        for(int i = 0; i < rows; i++) {
            //cols
            for(int j = 0; j < cols; j++) {
                System.out.print(numbers[i] [j] + " ");
            }
            System.out.println();
        }
        System.out.println("Thank you!");
    }
}