import java.util.*;

class Primary {
    public static int isPrime(int num) {
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
        
    public static void main(String[] args) {
        System.out.println("Primary number:- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // System.out.println("Number: " + num);
        // System.out.println(isPrime(num));
        // isPrime(num);

        if(isPrime(num) == 1) {
            System.out.println("Prime number");
        } else {
            System.out.println("Non-prime number");
        }
    }
}