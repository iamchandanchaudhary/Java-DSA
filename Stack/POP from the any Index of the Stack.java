import java.util.*;

class Stacks {
    public static void main(String args[]) {
        System.out.println("POP from any Index from Stack :- \n");

        Stack<Integer> s1 = new Stack<>();
        s1.push(12);
        s1.push(28);
        s1.push(23);
        s1.push(43);
        s1.push(95);
        s1.push(62);

        System.out.println("Original Stack : " + s1);

        Stack<Integer> s2 = new Stack<>();
        // Transfer starting element in second stack
        while(s1.size() > 3) {
            s2.push(s1.pop());
        }

        //System.out.println("Stack : " + s1);
        // Pop from 3rd Index
        s1.pop();

        while(s2.size() > 0) {
            s1.push(s2.pop());
        }

        System.out.println("Stack : " + s1);
    }
}