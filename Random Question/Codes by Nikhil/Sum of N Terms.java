import java.util.Scanner;

class Sum {
    public static void main(String args[]) {

        System.out.println("Sum of N Terms :- \n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Terms : ");
        int term = sc.nextInt();

        int number[] = new int[term];
        int sum = 0;

        System.out.println("Enter your Values : ");
        for(int i = 0; i < term; i++) {
            number[i] = sc.nextInt();

            sum += number[i];
        }
        System.out.println("Sum of All Values : " + sum);
    }
}