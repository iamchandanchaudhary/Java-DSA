import java.util.LinkedList;
import java.util.Scanner;

class LinkedLists {
    public static void main(String args[]) {
        System.out.println("Question 1 : Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.");
        System.out.println("Solution 2 (LinkedList) :- \n");

        // Solution
        Scanner sc = new Scanner(System.in);
        
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Taking size as Input
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        System.out.println();

        // Taking elements as Input
        for(int i = 0; i < size; i++) {
            System.out.print("Enter Element at Index (" + i + ") : ");
            
            int data = sc.nextInt();
            list.add(data);

        }
        System.out.println("\nOrigenal List : " + list);
        
        // Making condition according to Question
        System.out.print("Elements that are less then 25 : ");
        for(int i = 0; i < size; i++) {
            if(list.get(i) > 25) {
                continue;
            }
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}