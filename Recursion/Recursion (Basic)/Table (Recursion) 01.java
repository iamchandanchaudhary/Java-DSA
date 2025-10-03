import java.util.*;

class Recursion { 
    public static void printTable(int i, int value) {
        if(i == 11) {
            return;
        }
        System.out.println(value + " * "+ i + " : " + i*value);
        printTable(i + 1, value);
    }
    public static void main(String args[]) {
        System.out.println("Table (with Recursion) :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int value = sc.nextInt();

        System.out.println("\nTable of : " + value);

        printTable(1, value);

        System.out.println("\nThank You :)");
    }
}