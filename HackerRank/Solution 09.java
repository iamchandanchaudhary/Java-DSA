import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long n = sc.nextLong();
                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                    System.out.println("* long");

            } catch (Exception e) {
                // If the number is too big for long, it will throw exception
                String num = sc.next();
                System.out.println(num + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
