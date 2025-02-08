class QueueY {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        // full
        public static boolean isFull() {
            return front == (rear + 1) % size;
        }

        // empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1 ;
        }

        // enQueue 
        public static void enQueue(int data) {
            if(isFull()) {
                System.out.println("Overloding...");
                return; 
            }

            // single 
            if(front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // deQueue
        public static int deQueue() {
            if(isEmpty()) {
                System.out.println("Underflow...");
                return -1;
            }

            int result = arr[front];
            // 
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // peek 
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty...");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String args[]) {

        System.out.println("Circular Queue :- \n");

        Queue q2 = new Queue(5);
        q2.enQueue(1);
        q2.enQueue(2);
        q2.enQueue(3);
        q2.enQueue(4);
        q2.enQueue(5);

        q2.deQueue();
        q2.enQueue(6);

        while(!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.deQueue();
        }
    }
}