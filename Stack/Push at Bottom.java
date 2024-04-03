import java.util.*;

class Stacks {
    public static void main(String args[]) {
        
        System.out.println("Push at Bottom :- \n");

        // 1st Stack
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        System.out.println("Main Stack : " + s1);
        System.out.println("Top Element : " + s1.peek());

        // 2nd Element 
        Stack<Integer> s2 = new Stack<>();
        while(s1.size() > 0) {
            s2.push(s1.pop());
        }

        // Push at Bottom --> when Stack is empty
        s1.push(6);

        // Now call your elemnets
        while(s2.size() > 0) {
            s1.push(s2.pop());
        }
        System.out.println("Push at the Bottom of Stack : " + s1);
    }
}