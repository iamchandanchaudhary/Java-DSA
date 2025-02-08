import java.util.*;

class ArraysfindNumber {
    public static void main(String args[]) {
        System.out.println("Find Number X in Arrays : \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Arrays : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("\nEnter Your Arrays : ");
        for(int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.print("\nEnter Number that you want : ");
        int x = sc.nextInt();

        for(int i = 0; i < size; i++) {
            if(number[i] == x) {
                System.out.println("Number at Index : " + i);
            }
        }
    }
}