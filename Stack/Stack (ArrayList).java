import java.util.*;

class StackClass {
    
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }

        return list.get(list.size()-1);
        }
    }

    public static void main(String args[]) {
        System.out.println("Implemention of Stack with the help of ArrayList :- \n");

        Stack list = new Stack();
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