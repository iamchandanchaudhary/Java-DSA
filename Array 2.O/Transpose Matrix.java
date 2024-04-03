import java.util.*;

class Arrays {
    public static void main(String args[]) {

        System.out.println("Transpose a Matrix :- \n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int row = sc.nextInt();

        System.out.print("Enter column : ");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];
        int trans[][] = new int[row][column];

        // input your matrix
        System.out.println("Enter values of Matrix :- ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print("at Index(" + i + "," + j + ") : ");
                arr[i][j] = sc.nextInt();
            }
        }

        // output 
        System.out.println("\nOriginal Matrix :- ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // transpose it
        System.out.println("\nAfter Transpose :- ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                trans[i][j] = arr[j][i];

                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
        }
    }
}