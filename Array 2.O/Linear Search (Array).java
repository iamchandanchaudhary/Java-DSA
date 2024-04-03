import java.util.*;

class Arrays {
    public static void main(String args[]) {

        System.out.println("Linear Search(Array) :- \n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Values of Element :- ");
        for(int i = 0; i < size; i++) {
            System.out.print("at Index[" + i + "] : ");
            arr[i] = sc.nextInt(); 
        }

        System.out.print("\nOriginal Array : ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nSearch Element : ");
        int x = sc.nextInt();

        for(int i = 0; i < size; i++) {
            if(arr[i] == x) {
                System.out.println("Element (" + x + ") found at Index [" + i + "]");
            }
        }
        System.out.println("Thank You :)");
    }
}