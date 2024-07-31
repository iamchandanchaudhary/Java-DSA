import java.util.*;
import java.util.Queue;

class BasicQueue {
    public static void main(String[] args) {

        System.out.println("Operations on Queue :- \n");

        Queue<Integer> q1 = new LinkedList<>();

        System.out.println("Is Queue Empty? : " + q1.isEmpty());

        // enQueue --> Addition
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println("\nQueue : " + q1);
        System.out.println("Is Queue Empty? : " + q1.isEmpty());

        // deQueue --> Deletion
        q1.remove();
        System.out.println("\nExtracted Queue : " + q1);

        q1.poll();
        System.out.println("Extracted Queue : " + q1);

        // Size of Queue
        System.out.println("Size : " + q1.size());

        q1.add(9);
        q1.add(7);

        System.out.println("\nInserted Queue : " + q1);
        System.out.println("Size : " + q1.size());

        // Top Element
        System.out.println("\nTop Element : " + q1.peek());
        System.out.println("Top Element : " + q1.element());
        
    }
}
