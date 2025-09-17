import java.util.*;

class FirstFunction {
    public static int calculateOddSum(int n) {
        int sum = 0;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = calculateOddSum(n);
        //odd sum
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
            sum = sum + i;
        }
        }
        System.out.println(sum);
    }
}