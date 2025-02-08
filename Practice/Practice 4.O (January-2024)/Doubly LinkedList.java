import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

class DLL {
    public static void main(String args[]) {
        System.out.println("Doubly LinkedList :- \n");

        Scanner sc = new Scanner(System.in);

        // Creation list
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(15);
        list.add(20);
        list.add(30);
        list.add(35);

        System.out.print("List : ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //System.out.println("List : " + list);

        // Add at Index --> 2, element = 25
        list.add(2, 25);

        //System.out.println("New list : " + list);

        System.out.print("Modified List : ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println("Sorted List : " + list);
    }
}