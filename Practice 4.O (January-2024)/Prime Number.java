import java.util.*;

class Prime {
    public static void main(String args[]) {
        System.out.println("Finding Prime Number or Not :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int f = 0;

        if(n == 0 || n == 1) {
            f = 1;
        }
        for(int i = 2; i <= n/2; i++) {
            if(n%i == 0) {
                f = 1;
                break;
            }
        }
        
        if(f == 0) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }
        //System.out.println("\nThank You :)");
    }
}