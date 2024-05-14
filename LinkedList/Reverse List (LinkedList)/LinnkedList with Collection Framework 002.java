import java.util.LinkedList;
import java.util.Collections;
import java.util.*;

class LinkedLists {
    public static void main(String args[]) {

        System.out.println("Collection Framework in LinkedList :- \n");

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(4);
        list.add(8);
        list.add(0);
        list.add(6);
        list.add(5);

        System.out.println("List : " + list);

        System.out.print("List : ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sorting 
        Collections.sort(list);
        System.out.println("Sorted List : " + list);

        // reverse 
        Collections.reverse(list);
        System.out.println("Reverse List : " + list);
    }
}