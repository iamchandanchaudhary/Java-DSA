import java.util.*;

class Shorting {
    public static void shortingArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        System.out.println("Shorting in Ascending order : ");

        int arr[] = {6, 8, 12, 9, 32, 1, 7, 6, 3, 2};

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
        shortingArr(arr);
    }
}