import java.util.Queue;
import java.util.*;

class QueueY {
    public static void main(String args[]) {
        
        System.out.println("Queue Operations :- \n");

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println("1st Queue : " + q1);

        Queue<Integer> q2 = new ArrayDeque<>();
        
        System.out.print("Display Queue : ");
        while(q1.size() > 0) {
            System.out.print(q1.peek() + " ");
            q2.add(q1.poll());

        }

        System.out.println("\n2nd Queue : " + q2);

        while(q2.size() > 0) {
            q1.add(q2.remove());
        }

        System.out.println("2nd Queue : " + q2);
    }
}