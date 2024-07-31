import java.util.*;

class QueueY {
    public static void main(String args[]) {

        System.out.println("Queue (Array Deque) :- \n");

        //Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);

        while(!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.remove();
        }
    }
}