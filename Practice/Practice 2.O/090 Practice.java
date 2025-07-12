import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        System.out.print("Enter your no. : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Odd output till your no. : ");
        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0)
            System.out.println(i);
        }
    }
}