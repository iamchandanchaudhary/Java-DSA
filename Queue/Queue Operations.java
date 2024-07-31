import java.util.Queue;
import java.util.*;

class QueueY {
    Queue<Integer> q1 = new LinkedList<>();

    static int choice;
    static int value;

    public static void operations() {
        System.out.println("\t1. Add : ");
        System.out.println("\t2. Remove : ");
        System.out.println("\t3. Peek : ");
        System.out.println("\t4. Display : ");
        System.out.println("\t5. Exit");
    }

    // enQueue
    public static void addition(Queue<Integer> q1, Scanner sc) {
        System.out.print("Enter value : ");
        value = sc.nextInt();

        q1.add(value);
    }

    // deQueue
    public static void remove(Queue<Integer> q1) {
        if(q1.size() <= 0) {
            System.out.println("Queue is Empty!");
        } else {
            q1.remove();
            System.out.println("Top value has Removed");
        }
    }

    // Peek
    public static void peek(Queue<Integer> q1) {
        if(q1.size() <= 0) {
            System.out.println("Queue is Empty!");
        } else {

            System.out.println("Top Element : " + q1.peek());
        }
    }

    // Display
    public static void display(Queue<Integer> q1) {
        if(q1.size() <= 0) {
            System.out.println("Queue is Empty!");
        } else {

            System.out.println("Queue : " + q1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Queue Operations :- \n");

        Queue<Integer> q1 = new LinkedList<>();

        operations();

        do {
        System.out.print("\nEnter your Choice : ");
        choice = sc.nextInt();

        switch(choice) {
            case 1 : 
                addition(q1, sc);
            break;

            case 2 : 
                remove(q1);
            break;

            case 3 : 
                peek(q1);
            break;

            case 4 : 
                display(q1);
            break;

            default : System.out.println("Exit!");
                      System.out.println("Thank You :)");
        }

        } while(choice != 5);
    }
}
