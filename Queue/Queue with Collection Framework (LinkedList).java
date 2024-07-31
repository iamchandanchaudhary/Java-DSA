import java.util.*;

class QueueY {
    public static void main(String args[]) {
        
        System.out.println("Queue (LinkedList) :- \n");

        Queue<Integer> q1 = new LinkedList<>();
        //Queue<Integer> q2 = new ArrayDeque<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        while(!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}