import java.util.*;

class Arrays {
    public static void main(String args[]) {
        System.out.println("Find only Even Number in an Arrays :- \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        System.out.println("\nEnter Arrays : ");
        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter value at Index ["+ i +"] : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEven Number in this Arrays : ");
        for(int i = 0; i < size; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}