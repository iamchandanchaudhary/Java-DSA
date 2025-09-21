import java.util.*;

class FirstArray {
    public static void main(String args[]){
        System.out.println("2D Arrays :- \n");

        System.out.print("Enter rows No. : ");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.print("Enter cols No. : ");
        int cols = sc.nextInt();

        int numbers[] [] = new int[rows] [cols];

        System.out.println("\nEnter your Numbers : ");
        //input
        //rows
        for(int i = 0; i < rows; i++) {
            //cols
            for(int j = 0; j < cols; j++) {
                numbers[i] [j] = sc.nextInt();
            }
        }
        System.out.println("\nYour Numbers in 2D : ");

        //output
        //rows
        for(int i = 0; i < rows; i++) {
            //cols
            for(int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nThank you :)");
    }
}