import java.util.*;

class Stacks {

    public static void displayStack(Stack<Integer> s1) {
        if(s1.size() == 0) {
            return;
        }
        
        int x = s1.pop();
        System.out.print(x + " ");
        displayStack(s1);
        s1.push(x);

    }
    public static void main(String args[]) {
        System.out.println("Reverse Stack with using Recursion :- \n");

        Stack<Integer> s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        System.out.println("Original Stack : " + s1);

        System.out.print("Reverse Stack : ");
        displayStack(s1);
    }
}