import java.util.*;

class Stacks {
    public static void main(String[] args) {
        
        System.out.println("Copy/Rverse/Reverse Same Stack :- \n");

        // 1st Stack
        Stack<Integer> s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        System.out.println("Original Stack : " + s1);

        // 2nd Stack
        Stack<Integer> s2 = new Stack<>();
        while(s1.size() > 0) {
            s2.push(s1.pop());
        }
        System.out.println("Reverse Stack : " + s2);

        // 3rd Stack
        Stack<Integer> s3 = new Stack<>();
        while(s2.size() > 0) {
            int x = s2.peek();
            s3.push(x);
            s2.pop();
        }
        System.out.println("Copy 1st Stack : " + s3);

        // Reverse 1st Stack
        while(s3.size() > 0) {
            s1.push(s3.pop());
        }
        System.out.println("Reverse 1st Stack : " + s1);
    }

}