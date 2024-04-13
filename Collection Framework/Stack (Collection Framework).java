import java.util.Stack;

class StackClass {

    public static void main(String args[]) {

        System.out.println("Stack with Collection Framework :- \n");

        Stack<Integer> list = new Stack<Integer>();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        while(!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
    }
}