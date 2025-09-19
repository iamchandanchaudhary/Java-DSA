import java.util.*;

class FirstArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number [] = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }
    }
}