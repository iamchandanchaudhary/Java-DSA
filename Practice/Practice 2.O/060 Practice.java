import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        //if odd
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        if(i % 2 != 0) {
            System.out.println(sum);
        }
    }
}