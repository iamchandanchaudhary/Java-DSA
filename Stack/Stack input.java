import java.util.*;

class Stacks {
    public static void main(String[] args) {
        
        System.out.println("Stack :- \n");

        Scanner sc = new Scanner(System.in);

        Stack<Integer> s1 = new Stack<>();

        System.out.print("Enter size of Stack : ");
        int n = sc.nextInt();

        System.out.print("\nEnter Elements : ");
        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            s1.push(x);
        }
        System.out.println("Stack is : " + s1);
    }
}