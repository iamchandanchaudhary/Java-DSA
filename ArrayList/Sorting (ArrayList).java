import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String args[]) {
        System.out.println("Sorting List (ArrayList) :- \n");

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(81);
        list.add(23);
        list.add(12);
        list.add(0);
        list.add(54);
        list.add(19);
        list.add(4);
        list.add(71);
        list.add(27);

        System.out.println("Normal List : " + list);

        // Sorting this
        Collections.sort(list);

        System.out.println("Sorted List : " + list);
    }
}