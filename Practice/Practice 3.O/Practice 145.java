import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        System.out.println("Her Table :- ");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i*m);
        }

    }
}