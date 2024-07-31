import java.util.*;

class QueueY {
    public static void main(String args[]) {
        
        System.out.println("Reverse a Queue :- \n");

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println("Original Queue : " + q1);

        // Reversing a Queue is only happend with another Stack
        Stack<Integer> s1 = new Stack<>();

        // Transfer Queue value in Stack
        while(q1.size() > 0) {
            s1.push(q1.poll());
        }

        // calling value in Queue
        while(s1.size() > 0) {
            q1.add(s1.pop());
        }

        System.out.println("Reversed Queue : " + q1);

    }
}