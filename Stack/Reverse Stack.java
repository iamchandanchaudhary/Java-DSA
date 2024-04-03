import java.util.*;

class Stacks {
    public static void main(String args[]) {
        System.out.println("Reverse Stack :- \n");

        Stack<Integer> s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);

        System.out.println("Original Stack : " + s1);


        Stack<Integer> s2 = new Stack<>();

        while(s1.size() > 0) {
            int x = s1.peek();
            s2.push(x);
            s1.pop();
        }

        // <-- OR --> 
        // while(s1.size() > 0) {
        //     s2.push(s1.pop());
        // }

        System.out.println("Reverse Stack : " + s2);
    }
}