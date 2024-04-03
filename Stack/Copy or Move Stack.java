import java.util.*;

class Stacks {
    public static void main(String args[]) {

        System.out.println("Copy Stack :- \n");

        // 1st Stack
        Stack<Integer> s1 = new Stack<>();

        s1.push(12);
        s1.push(32);
        s1.push(15);
        s1.push(77);
        s1.push(18);
        s1.push(11);

        System.out.println("Original Stack : " + s1);

        // 2nd Stack
        Stack<Integer> s2 = new Stack<>();
        while(s1.size() > 0) {
            s2.push(s1.pop());
        }

        //System.out.println("2nd Stack : " + s2);

        // 3rd Stack 
        Stack<Integer> s3 = new Stack<>();
        while(s2.size() > 0) {
            int x = s2.peek();
            s3.push(x);
            s2.pop();
        }

        System.out.println("Copied Stack : " + s3);
    }
}