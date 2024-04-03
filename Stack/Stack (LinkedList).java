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

        // push - Addition at the First Place
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            } 

            newNode.next = head;
            head = newNode;
        }

        // Pop - Deletion from the first place
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek - Knowing the details of Top Element
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]) {

        System.out.println("Implementation of Stack (Push, Pop, Peek) with the help of LinkedList :- \n");

        Stack s1 = new Stack();

        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        while(!s1.isEmpty()) {
        System.out.println(s1.peek());
        s1.pop();
        }
    }
}
