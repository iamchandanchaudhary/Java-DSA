class StackClass {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String args[]) {

        System.out.println("Stack(Push, Pop & Peek) :- \n");

        Stack s1 = new Stack();

        s1.push(7);
        s1.push(2);
        s1.push(5);
        s1.push(9);
        s1.push(2);

        while(!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }   
}