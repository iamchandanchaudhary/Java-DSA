import java.util.*;

class FirstBits {
    public static void main(String args[]) {

        System.out.print("Enter the Decimal no. : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Enter position you need : ");
        int pos = sc.nextInt();

        int bitMask = 1<<pos;

        if((bitMask & n) == 0) {
            System.out.println("The Bit was Zero");
        } else {
            System.out.println("The Bit was one");
        }

        System.out.println("Thank you!");
    }
}