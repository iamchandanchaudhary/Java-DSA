import java.util.LinkedList;
import java.util.Scanner;

class LinkedLists {
    public static void main(String args[]) {
        System.out.println("Question 1 : Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.");
        System.out.println("Solution 1 (LinkedList) :- \n");

        // Solution - 
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<Integer>();

        // adding element in list
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        System.out.println("List : " + list);

        // Searching Number 
        System.out.print("\nSearch Number : ");
        int number = sc.nextInt();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == number) {
                System.out.println(number + " at Index : " + i);
            }
        }
    }
}