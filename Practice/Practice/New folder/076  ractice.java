import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        System.out.println("Enter N no. : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
        if(i % 2 != 0) {
            System.out.println(i);
        }
    }
    System.out.println("Here all The Odd no. Till N");
    }
}