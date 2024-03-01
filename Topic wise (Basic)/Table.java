import java.util.*;

class Table {
    public static void main(String args[]) {

        System.out.println("Table :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        
        System.out.println("\nThe Table of : " + n);

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " : " + i*n);
        }
        System.out.println("\nThank You :)\n");
    }
}