import java.util.*;

class Solution {
    public static int countPrimes(int n) {

        int i, j, count = 0;
        
        for(i = 1; i <= n; i++) {
            for(j = 2; j < i; j++) {
                if(i % j == 0) {
                    break;
                }
            }
            
                if(i == j) {
                    count++;
                }
        }
        // System.out.println(count);
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countPrimes(n));
    }
}