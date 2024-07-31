import java.util.*;
import java.util.Stack;
import java.util.Queue;

class QueueY {
    public static void main(String args[]) {
        
        System.out.println("Implement Stack using Queue :- \n");

        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println("Original Queue : " + q1);
        System.out.println("Normal Peek : " + q1.peek());

        // peek the Last element --> Like Stack
        for(int i = 0; i < q1.size()-1; i++) {
            q1.add(q1.remove());
        }

        // Peek the top element in Queue
        int peek1 = q1.peek();

        q1.add(q1.remove());

        System.out.println("Last Element : " + peek1);

        // pop the latest element of the Queue --> like Stack
        for(int  i = 0; i < q1.size()-1; i++) {
            q1.add(q1.remove());
        }

        q1.remove();

        System.out.println("\nRemoved latest Element : " + q1);
    }
}
