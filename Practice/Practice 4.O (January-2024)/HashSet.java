import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Hashing {
    public static void main(String args[]) {

        System.out.println("Basic Operations with HashSet :- \n");
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(4);
        set.add(7);

        System.out.println("Set : " + set);

        // Search - Contain
        System.out.print("Search Element : ");
        int key = sc.nextInt();

        System.out.println("Answer : " + set.contains(key));

        // // Delete - remove
        // set.remove(4);
        // System.out.println("\nNew Set : " + set);

        // iteration 
        Iterator it = set.iterator();

        System.out.print("\nAll Elements : ");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\nSize of Set : " + set.size());
    }
 }