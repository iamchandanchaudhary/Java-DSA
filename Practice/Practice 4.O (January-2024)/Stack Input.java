import java.util.*;

class Stacks {
    public static void main(String[] args) {
        System.out.println("Stack input :- \n");

        Stack<Integer> s1 = new Stack<>();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        System.out.print("Enter Elements : ");
        for(int i = 1; i <= size; i++) {
            int x = sc.nextInt();
            s1.push(x);

        }
        System.out.println("Stack : " + s1);
    }
}