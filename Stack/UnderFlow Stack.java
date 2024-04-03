import java.util.*;

class Stacks {
    public static void main(String[] args) {
        System.out.println("UnderFlow Stack :- \n");

        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        System.out.println("Original Stack : " + s1); // 1 2 3 4 5

        s1.pop();
        System.out.println("Stack : " + s1); // 1 2 3 4

        s1.pop();
        System.out.println("Stack : " + s1); // 1 2 3

        s1.pop();
        System.out.println("Stack : " + s1); // 1 2

        s1.pop();
        System.out.println("Stack : " + s1); // 1

        // Here The stack is Empty
        s1.pop();
        System.out.println("Stack : " + s1); //

        // Pop after stack is Empty --> Called Stack UnderFlow 
        s1.pop();
        System.out.println("Stack : " + s1);
    }
}