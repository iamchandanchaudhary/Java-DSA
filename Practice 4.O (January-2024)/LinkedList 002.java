import java.util.*;

class LinkedLists {
    public static void main(String args[]) {
        System.out.println("LinkedList with Collection Framework :- \n");

        LinkedList<Integer> list = new LinkedList<Integer>();

        // add
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(5);
        list.add(2);

        System.out.println("List : " + list);

        // addFirst
        list.addFirst(8);
        System.out.println("List(Add First) : " + list);

        // add in b/w
        list.add(4, 9);
        list.add(6, 12);
        System.out.println("List(Add in b/w) : " + list);

        // remove
        list.remove(4);
        System.out.println(("List(Delete) : " + list));

        // size of list
        int size = list.size();
        System.out.println("Size of List : " + size);

        // get element
        int get = list.get(5);
        System.out.println("Element at Index(5) : " + get);

        // replace
        list.set(4, 22);
        System.out.println("New List : " + list);

        // reverse
        Collections.reverse(list);
        System.out.println("Reverse List : " + list);
        
        // sort
        Collections.sort(list);
        System.out.println("In Ascending order : " + list);

        // all element in the form of LinkedList
        System.out.print("LinkedList : ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        System.out.println("\nThank You :)");
    }
}