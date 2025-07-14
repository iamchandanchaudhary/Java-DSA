import java.util.*;

class FirstPattern {
    public static void main(String arhs[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for( int i = 0; i <= n; i++ ) {
            sum = sum + i;
        } System.out.println(sum);
    }
}