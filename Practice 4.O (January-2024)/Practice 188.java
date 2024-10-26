import java.LinkedList;
import java.Collections;
import java.util.*;

class LinkedLists {
    public static void main(String args[]) {
        System.out.println("LinkedList(Normal List) :- \n");

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(4);
        list.addFirst(2);
        list.add(23);
        list.add(99);
        list.add(12);

        System.out.println("Origenal List : " + list);

        System.out.println("Element at Index(3) : " + list.get(3));

        // add in b/w
        list.add(2, 8);
        System.out.println("Add Something : " + list);

        // sort list
        Collections.sort(list);
        System.out.println("Ascending order : " + list);

        // reverse list
        Collections.reverse(list);
        System.out.println("Descending Order : " + list);

        // size of list
        System.out.println("Size of List : " + list.size());

        System.out.println("\nThank You :)");
        }
}