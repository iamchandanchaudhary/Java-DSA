class MyRunnable implements Runnable {
    private String threadName;

    MyRunnable(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}

public class ThreadExampleUsingRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("Runnable-1"));
        Thread t2 = new Thread(new MyRunnable("Runnable-2"));

        t1.start();
        t2.start();
    }
}
