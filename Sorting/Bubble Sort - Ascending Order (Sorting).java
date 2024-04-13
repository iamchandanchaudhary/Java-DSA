import java.util.*;

class Shorting {

    public static void main(String args[]) {
        System.out.println("Shorting (Bubble Short) :- \n");

        int arr[] = {9, 1, 5, 7, 2, 6, 4};

        System.out.print("Original Value : ");
        for(int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Time Complaxity ==> O(n^2)
        // Bubble Shorting
        System.out.print("Shorting in Accending Order : ");
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {

                if(arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
                for(int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("\n\nThank You :) \n");
    }
}