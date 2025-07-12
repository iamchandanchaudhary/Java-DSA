import java.util.*;

class FirstArrays {
    public static void main(String args[]) {

        System.out.print("Enter Inputs Size : ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter inputs : ");

        int numbers[] = new int[size];

        //input
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter x no. :");

        int x = sc.nextInt();

        //output
        for(int i = 0; i < size; i++) {
            if(numbers[i] == x) {
          System.out.println("x found at index : " + i);
            }
        }
    }
}