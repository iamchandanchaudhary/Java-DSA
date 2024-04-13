import java.util.*;

class Shorting {
    public static void main(String args[]) {

        System.out.println("==> Bubble Short :- \n");

        System.out.println("Shorting Ascending Order : ");
        Scanner sc = new Scanner(System.in);

        // Defining Arrays Size
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Taking Input
        System.out.println("Enter Number : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // Origenal List
        System.out.print("Origenal Order : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Bubble Short
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {

                // Swap
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Output the Ascending Order
        System.out.print("Ascending Order : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nThank You :)");
    }
}