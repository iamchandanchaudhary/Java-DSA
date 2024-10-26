import java.util.*;

class Stacks {
    public static void main(String args[]) {

        System.out.println("Stack Reverse :- \n");

        Stack<Integer> s1 = new Stack<>();

        s1.push(21);
        s1.push(12);
        s1.push(45);
        s1.push(33);
        s1.push(32);
        
        // Display Stack
        System.out.print("Stack : ");
        for(int i = s1.size(); i >= 1; i--) {
            int x = s1.peek();
            System.out.print(x + " ");
            s1.pop();
        }
    }
}