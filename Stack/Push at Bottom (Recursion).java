import java.util.*;

class StackClass {

    public static void pushatBottom(int data, Stack<Integer> list) {

        if(list.isEmpty()) {
            list.push(data);
            return;
        }

        int top = list.pop();
        pushatBottom(data, list);
        list.push(top);
    }
    public static void main(String args[]) {

        System.out.println("Push at Bottom(Stack) :- \n");
        
        Stack<Integer> list = new Stack<Integer>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        pushatBottom(6, list);

        System.out.print("Push at Bottom : ");
        while(!list.isEmpty()) {
            System.out.print(list.peek() + " ");
            list.pop();
        }
    }
}