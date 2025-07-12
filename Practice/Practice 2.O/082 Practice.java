import java.util.*;

class FirstArrays {
    public static void main(String args[]) {
        
        System.out.print("Enter input size : ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter inputs : ");

        //input
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Your numbers : ");

        //output
        for(int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}