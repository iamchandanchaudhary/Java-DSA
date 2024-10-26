import java.util.*;

class StackClass {

    public static void pushAtBottom(int data, Stack<Integer> s2) {
        
        if(s2.isEmpty()) {
            s2.push(data);
            return;
        }

        int top = s2.pop();
        pushAtBottom(data, s2);
        s2.push(top);

    }
    public static void main(String args[]) {
        
        System.out.println("Stack \n");

        Stack<Integer> s2 = new Stack<>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        s2.push(5);

        pushAtBottom(7, s2);
        //System.out.print("Stack : ");
        while(!s2.isEmpty()) {
            System.out.println(s2.peek());
            s2.pop();
        }
    }
}