import java.util.*;

class FirstArray {
    public static void main(String args[]) {

        // Beauty
        System.out.print("Enter input size : ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter inputs : ");

        // input
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        // Beauty
        System.out.print("Enter x no. : ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < size; i++) {
            if (number[i] == x) {
                System.out.println("x found at index : " + i);
            }

        }
    }
}