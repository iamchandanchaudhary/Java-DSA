class QueueY {

    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head;
        static Node tail;


        // empty List
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // enQueue
        public static void add(int data) {
            Node newNode = new Node(data);
            if(head == null && tail == null) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // deQueue
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Underflow...");
                return -1;
            }

            int front = head.data;
            if(head == tail) {
                head = null;
            }
            head = head.next;

            return front;
        }

        // peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("UnderFlow...");
                return -1;
            }

            return head.data;
        }
    }
    
    public static void main(String args[]) {

        System.out.println("Queue using LinkedList :- \n");

        Queue q1 = new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        while(!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}