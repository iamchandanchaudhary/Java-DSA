import java.util.*;

class Stacks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Stack(Insert at any Index) :- \n");

        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        // 1st Stack
        Stack<Integer> s1 = new Stack<>();

        System.out.print("Enter Elements : ");
        for(int i = 1; i <= size; i++) {
            int x = sc.nextInt();
            s1.push(x);
        }
        System.out.println("Main Stack : " + s1);

        System.out.println("\nNow insert Element :- ");
        // Insert Element at any index
        System.out.print("Enter Element : ");
        int element = sc.nextInt();

        System.out.print("at Index : ");
        int index = sc.nextInt();

        // 2nd Stack
        Stack<Integer> s2 = new Stack<>();
        while(s1.size() >= index) {
            s2.push(s1.pop());
        }
        s1.push(element);

        // call elements
        while(s2.size() > 0) {
            s1.push(s2.pop());
        }
        System.out.println("New Stack : " + s1);

        System.out.println("\nThank You :)\n");
    }
}