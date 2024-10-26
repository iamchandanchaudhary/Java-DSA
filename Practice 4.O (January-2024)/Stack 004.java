import java.util.Stack;

class StackClass {

    // public class Node {

    // }

    // public class Stack {

    // }
    public static void main(String args[]) {

        System.out.println("Stack with Collection Framework :- \n");

        Stack<Integer> list = new Stack<Integer>();

        list.push(4);
        list.push(2);
        list.push(7);
        list.push(9);
        list.push(5);

        while(!list.isEmpty()) {
            System.out.print(list.peek() + " ");
            list.pop();
        }
    }
}