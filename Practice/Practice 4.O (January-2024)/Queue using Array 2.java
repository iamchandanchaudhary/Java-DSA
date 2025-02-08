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

    // enQueue 
    public static void enQueue(int data) {
        if(rear == size-1) {
            System.out.println("Queue is Full...");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    // deEnqueue
    public static int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty...");
            return -1;
        }

        int front = arr[0];
        for(int i = 0; i < rear; i++) {
            arr[i] = arr[i+1];
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

        Queue q1 = new Queue(10);

        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        q1.enQueue(5);
        q1.enQueue(6);

        System.out.print("Queue : ");
        while(!q1.isEmpty()) {
            System.out.print(q1.peek() + " ");
            q1.deQueue();
        }
    }
}