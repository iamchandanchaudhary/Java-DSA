import java.util.*;

class QueueY {
    public static void main(String args[]) {

        System.out.println("Reverse first K Element of Queue :- \n");

        Scanner sc = new Scanner(System.in);

        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println("Original Queue : " + q1);

        // This Queue will reverse From K Index
        System.out.print("Enter K Element : ");
        int K = sc.nextInt();

        Stack<Integer> s1 = new Stack<>();
        
        while(q1.size() >= K) {
            s1.push(q1.poll());
        }

        while(s1.size() > 0) {
            q1.add(s1.pop());
        }

        System.out.println("\nNew Reversed Queue : " + q1);
    }
}