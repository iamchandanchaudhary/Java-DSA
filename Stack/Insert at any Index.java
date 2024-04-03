import java.util.*;

class Stacks {
    public static void main(String args[]) {

        System.out.println("Stack(Insert at any Index) :- \n");

        // 1st Stack
        Stack<Integer> s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        System.out.println("Original Stack : " + s1);

        System.out.println("\nQ.1 : Insert Element[8] at Index(3) ");

        int idx = 3;
        int element = 8;
        // 2nd Stack 
        Stack<Integer> s2 = new Stack<>();
        while(s1.size() >= idx) {
            s2.push(s1.pop());
        }

        // insert at element 8
        s1.push(element);

        while(s2.size() > 0) {
            s1.push(s2.pop());
        }
        System.out.println("New Stack : " + s1);
        
    }
}