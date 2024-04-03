import java.util.*;

class Stacks {

    public static void displayStack(Stack<Integer> s1) {
        if(s1.size() == 0) {
            return;
        }
        
        int x = s1.pop();
        displayStack(s1);
        System.out.print(x + " ");
        s1.push(x);

    }
    public static void main(String args[]) {
        System.out.println("Display Stack with using Recursion :- \n");

        Stack<Integer> s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        System.out.print("Stack : ");
        displayStack(s1);
    }
}