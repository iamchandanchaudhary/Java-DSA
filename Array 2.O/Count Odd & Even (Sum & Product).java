import java.util.*;

class Arrays {
    public static void main(String args[]) {
        System.out.println("Count Odd & Even also Find Sum and Product :- \n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum = 0, product = 1;

        // taking input
        System.out.println("Enter values of Array :- ");
        for(int i = 0; i < size; i++) {
            System.out.print("at Index(" + i + ") : ");
            arr[i] = sc.nextInt();
        }

        // output original array
        System.out.print("\nOriginal List : ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // find even & odd for performing operation
        for(int i = 0; i < size; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
            else {
                product *= arr[i];
            }
        }

        System.out.println("Sum of Even : " + sum);
        System.out.println("Product of Odd : " + product);

        System.out.println("\nThank You :)");
    }
}