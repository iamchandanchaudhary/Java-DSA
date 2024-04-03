import java.util.*;

class Arrays {
    public static void main(String args[]) {

        System.out.println("Sum of 2D Matrix :- \n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        System.out.print("Enter coloum : ");
        int coloum = sc.nextInt();

        int a[][] = new int[row][coloum];
        int b[][] = new int[row][coloum];
        int sum[][] = new int [row][coloum];
        
        // taking input 1st Matrix
        System.out.println("\nEnter values of 1st Matrix :- ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < coloum; j++) {
                System.out.print("at Index(" + i + "," + j + ") : ");
                a[i][j] = sc.nextInt();
            }
        }

        // taking input 2nd Matrix 
        System.out.println("\nEnter Values of 2nd Matrix :- ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < coloum; j++) {
                System.out.print("at Index(" + i + "," + j + ") : ");
                b[i][j] = sc.nextInt();
            }
        }

        // adding both matrix
        System.out.println("\nSum of Both Matrix :- ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < coloum; j++) {
                sum[i][j] = a[i][j] + b[i][j];

                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }


        // System.out.println("\nOriginal Array : ");
        // for(int i = 0; i < 3; i++) {
        //     for(int j = 0; j < 3; j++) {
        //         System.out.print(a[i][j] + "\t");
        //     }
        //     System.out.println();
        // }
    }
}