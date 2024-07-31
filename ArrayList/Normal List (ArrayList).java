import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String args[]) {
        System.out.println("ArrayList :- \n\n");

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add Element
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println("List : " + list);

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("He");
        list2.add("is");
        list2.add("Chandan ");
        list2.add("Chaudhary");

        System.out.println("\nList of Sentence : " + list2);

        // Get Element
        int element = list.get(4);
        System.out.println("\nElement at index 4 : " + element);

        // Insert Element or add in b/w list
        list.add(3, 3);

        System.out.println("\nList : " + list);

        // set element or change element
        list.set(0, 12);
        System.out.println("\nAfter Set Another number : " + list);

        // delete element or Remove
        list.remove(0);
        System.out.println("\nDeleting Element : " + list);

        // Size of list
        int size = list.size();
        System.out.println("\nSize of List : " + size);


        // loops 
        System.out.print("\nYour List : ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Add Again
        list.add(0,9);
        list.add(3, 7);
        list.add(6,0);
        list.add(8);

        System.out.println("\nNew List : " + list);

        // Shorting list

        Collections.sort(list);
        System.out.println("\nSorted List : " + list);
    }
}