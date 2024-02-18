import java.util.*;

class Recursion {
    public static void printSum(int i, int n, int sum) {
        if(i == n) {
            sum += i;
            System.out.println("\nSum of N : " + sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum); 
    }
    public static void main(String args[]) {

        System.out.println("Q.1 : Sum of N :- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        printSum(1, n, 0);

        System.out.println("Thank You :)");
    }
}