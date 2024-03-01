import java.util.*;

class FirstBits {
    public static void main(String args[]) {

        System.out.print("Enter your no. for Update : ");

        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        int n = 5; //101
        int pos = 1;

        int bitMask = 1<<pos;
        
        System.out.print("The Decimal value Become : ");

        if(
            //set
        (operation == 1)) {
        int newNumber = bitMask | n;

            System.out.println(newNumber);
        } else {
            //clear
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;

            System.out.println(newNumber);
        }
    }
}