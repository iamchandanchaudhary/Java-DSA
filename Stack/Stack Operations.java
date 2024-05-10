import java.util.*;
import java.util.Stack;

import javax.swing.plaf.synth.SynthLookAndFeel;

class Stacks {
    static int choice;
    static int value;

    public static void options() {
        System.out.println("Choose Your Option : ");
        System.out.println("\t1.Push");
        System.out.println("\t2.Pop");
        System.out.println("\t3.Peek");
        System.out.println("\t4.Display");
        System.out.println("\t5.Exit");

    }

    // push
    public static void push(Stack<Integer> s1, Scanner sc) {
        System.out.print("Enter value : ");
        value = sc.nextInt();

        s1.push(value);
    }

    // pop
    public static void pop(Stack<Integer> s1) {
        if(s1.size() <= 0) {
            System.out.println("Stack is Underflow!");
        }
        else {
            s1.pop();
            System.out.println("Top Value Removed");
        }
    }

    // peek
    public static void peek(Stack<Integer> s1) {

        if(s1.size() <= 0) {
            System.out.println("Stack is Empty!");
        }
        else {
            System.out.println("Top Value : " + s1.peek());
        }
    }

    // display
    public static void display(Stack<Integer> s1) {
        if(s1.size() <= 0) {
            System.out.println("Stack is Empty!");
        }
        else {
            System.out.println("Stack : " + s1);
        }
    }

    public static void main(String args[]) {
        System.out.println("Stack Operations :- \n");

        Scanner sc = new Scanner(System.in);

        options();
        Stack<Integer> s1 = new Stack<>();

        do {
            System.out.print("\nEnter Your Choice : ");
            choice = sc.nextInt();

            switch(choice) {

                case 1 : push(s1, sc);
                    break;

                case 2 : pop(s1);
                    break;

                case 3 : peek(s1);
                    break;

                case 4 : display(s1);
                    break;

                default : System.out.println("Exit!");
                          System.out.println("Thank You :)");
            }

        }
        while(choice != 5);

    }
}