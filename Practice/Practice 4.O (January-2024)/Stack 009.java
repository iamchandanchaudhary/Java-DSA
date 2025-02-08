import java.util.*;

class Stacks {
    public static void main(String args[]) {
        
        System.out.println("POP from Bottom of the Stack :- \n");

        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        // 1st Stack
        System.out.println("Original Stack : " + s1);
        Stack<Integer> s2 = new Stack<>();
        while(s1.size() > 0) {
            s2.push(s1.pop());
        }

        // Delete the 1st Element from 2nd Stack
        s2.pop();

        // 2nd Stack
        while(s2.size() > 0) {
            s1.push(s2.pop());
        }

        System.out.println("POP From Bottom : " + s1);
    }
}