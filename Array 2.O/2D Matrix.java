import java.util.*;

class Arrays1 {
    public static void main(String args[]) {

        System.out.println("2D Matrix :- \n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        System.out.print("Enter coloum : ");
        int coloum = sc.nextInt();

        int a[][] = new int[row][coloum];
        
        System.out.println("\nEnter values of Matrix :- ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < coloum; j++) {
                System.out.print("at Index(" + i + "," + j + ") : ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix is : ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < coloum; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}