import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String args[]) {
        System.out.println("ArrayList :- \n");

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add 
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(9);

        System.out.println("List : " + list);

        // get element
        int get = list.get(3);

        System.out.println("Element at Index (3) : " + get);

        // add in b/w
        list.add(2,3);
        System.out.println("Add in b/w List : " + list);

        // size of list
        int size = list.size();
        System.out.println("Size of List : " + size);

        // set another element
        list.set(3, 7);
        System.out.println("Replacing at index(3) : " + list);

        // delete
        list.remove(1);
        System.out.println("After deleting : " + list);

        // Looping 
        System.out.print("Normal List : ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println("Sorted :" + list);

        System.out.print("Descending Order : ");
        for(int i = 5; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}