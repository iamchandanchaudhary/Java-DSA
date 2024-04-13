import java.util.LinkedList;
import java.util.*;

class LinkedLists {
    public static void main(String args[]) {

        System.out.println("LinkedList with Collection Framework :- \n");

        LinkedList<String> list = new LinkedList<String>();

        // add - first
        list.addFirst("Beautiful");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");

        System.out.println("Add First : " + list);

        // Add - last
        list.addLast("Place");
        System.out.println("Add Last : " + list);

        // delete - first
        list.removeFirst();
        System.out.println("Delete first : " + list);

        // delete - last
        list.removeLast();
        System.out.println("Delete Last : " + list);

        // size of List
        int size = list.size();
        System.out.println("Size of List : " + size);

        // add in b/w
        list.add(2, "very");
        list.addFirst("this");

        System.out.println("Adding in b/w : " + list);

        // replace
        list.set(4, "Awesome");
        System.out.println("Set another : " + list);

        // add last
        list.add("Place");
        System.out.println("Adding : " + list);

        // delete
        list.remove(0);
        System.out.println("Remove(0) : " + list);

        // add - first
        list.addFirst("This");
        System.out.println("Add first : " + list);

        // get element from any place
        String element = list.get(3);
        System.out.println("Character at Place : " + element);

        // print list - loop

        System.out.print("Full Sentence : ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("Null");

    }
}