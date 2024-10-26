import java.util.*;

class Stacks {
    public static void main(String args[]) {

        System.out.println("Stack :- \n");

        Stack<Integer> s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        Stack<Integer> s2 = new Stack<>();
        while(s1.size() > 0) {
            int x = s1.pop();
            System.out.println(x);
            s1.push(x);
        }
        System.out.println(s1);
    }
}