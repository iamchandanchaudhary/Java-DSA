import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        //if odd
        if(n != 0) {
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        }
        System.out.println(sum);

    }
}