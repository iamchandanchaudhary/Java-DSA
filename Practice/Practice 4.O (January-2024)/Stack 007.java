import java.util.*;

class Stacks {
    public static void main(String args[]) {

        System.out.println("Stack Operations :- \n");

        Stack<Integer> s1 = new Stack<>();

        // when stack is Empty
        System.out.println("Stack : " + s1);
        System.out.println("Is Stack is Empty : " + s1.isEmpty());

        // when size is Zero
        System.out.println("Size is : " + s1.size() + "\n");

        s1.push(1);

        System.out.println("Is Stack is Empty : " + s1.isEmpty());

        s1.push(12);
        s1.push(34);
        s1.push(24);
        s1.push(51);
        s1.push(68);

        //s1.pop();
        // Top element 
        System.out.println("Top Element : " + s1.peek());

        // print stack
        System.out.println("Stack is : " + s1);

        // pop - remove element 
        s1.pop();
        System.out.println("Stack is : " + s1);

        // Size
        int size = s1.size();
        System.out.println("Size of Stack : " + size);


     // // peek element from spacific position 
        // while(s1.size() > 2) {
        //     s1.pop();
        // }

        // System.out.println("Element at Position (2) : " + s1.peek());

        // Print stack with loop
        System.out.print("Stack : ");
        while(!s1.isEmpty()) {
            System.out.print(s1.peek() + " ");
            s1.pop();
        }

        // after performing loop in a stack the stack elements depend on the is, if loop pop(remove) the whole stack, then the stack will also empty
        System.out.println("\nStack is : " + s1);
    }
}