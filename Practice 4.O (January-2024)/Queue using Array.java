class QueueY {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        
        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add 
        public static void enQueue(int data) {
            if(rear == size - 1) {
                System.out.println("Queue is Full...");
                return;
            }

            rear++;
            arr[rear] = data; 
        }

        // remove
        public static int deQueue() {
            if(isEmpty()) {
                System.out.println("Queue is Empty...");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }

        // peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String args[]) {

        System.out.println("Queue using Array...\n");

        Queue q = new Queue(7);

        q.enQueue(7);
        q.enQueue(6);
        q.enQueue(5);
        q.enQueue(4);
        q.enQueue(3);
        q.enQueue(2);
        q.enQueue(1);

        System.out.print("Queue : ");
        while(!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.deQueue();
        }
        
    }
}