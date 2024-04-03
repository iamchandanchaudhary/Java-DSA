import java.util.*;

class StackClass {

    public static void pushAtBottom(int data, Stack<Integer> s3) {
        if(s3.isEmpty()) {
            s3.push(data);
            return;
        }

        int top = s3.pop();
        pushAtBottom(data, s3);
        s3.push(top);
    }

    public static void reverse(Stack<Integer> s3) {
        if(s3.isEmpty()) {
            return;
        }

        int top = s3.pop();
        reverse(s3);
        pushAtBottom(top, s3);
    }
    public static void main(String args[]) {
        System.out.println("Rverse Stack :- \n");

        Stack<Integer> s3 = new Stack<Integer>();

        s3.push(1);
        s3.push(2);
        s3.push(3);
        s3.push(4);
        s3.push(5);

        reverse(s3);

        System.out.print("Reversed Stack : ");
        while(!s3.isEmpty()) {
            System.out.print(s3.peek() + " ");
            s3.pop();
        }
    }
}