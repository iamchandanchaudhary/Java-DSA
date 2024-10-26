import java.util.*;

class StackClass {
    public static void main(String args[]) {
        System.out.println("Stack using Collection Framework :- \n");

        Stack<Integer> s1 = new Stack<>();

        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        System.out.print("Stack : ");
        while(!s1.isEmpty()) {
            System.out.print(s1.peek() + " ");
            s1.pop();
        }
    }
}