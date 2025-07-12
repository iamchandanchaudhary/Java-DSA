import java.util.*;

class FirstBits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5; //101
        int pos = 1;

        int bitMask = 1<<pos;

        if((oper == 1)) {
            int newNumber = bitMask | n;

            System.out.println(newNumber);
        } else {
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            
            System.out.println(newNumber);
        }
    }
}