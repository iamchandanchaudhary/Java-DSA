import java.util.*;

class Stacks {
    public static void main(String args[]) {

        System.out.println("Print Stack :- \n");

        // 1st Stack
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        Stack<Integer> s2 = new Stack<>();
        while(s1.size() > 0) {
            s2.push(s1.pop());
        }

        // With the help of Loop
        System.out.print("Stack : ");
        while(s2.size() > 0) {
            int x = s2.pop();
            System.out.print(x + " ");
            s1.push(x);
        }
        //System.out.println(s1);
    }
}