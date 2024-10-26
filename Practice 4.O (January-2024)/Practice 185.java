import java.util.*;

class LinkedLists {
    public static void main(String args[]) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(3);
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(6);
        list.add(8);
        
        System.out.println("List : " + list);

        int size = list.size();
        System.out.println("Size : " + size);

        System.out.print("Full List : ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println("Ascending Order : " + list);

        System.out.print("Decendiing Order : ");
        for(int i = 7; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}