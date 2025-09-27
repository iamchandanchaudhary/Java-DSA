import java.util.*;

class Stacks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Questions of Stack :- \n");
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        System.out.println("Original Stack : " + s1);
        Stack<Integer> s2 = new Stack<>();

        // Delete From Bottom
        while(s1.size() > 0) {
            s2.push(s1.pop());
        }

        s2.pop();

        while(s2.size() > 0) {
            s1.push(s2.pop());
        }

        System.out.println("Remove from Bottom : " + s1);

        // delete from any index
        System.out.print("\nEnter Index : ");
        int x = sc.nextInt();

        while(s1.size() > x) {
            s2.push(s1.pop());
        }

        s1.pop();

        while(s2.size() > 0) {
            s1.push(s2.pop());
        }

        System.out.println("New Stack : " + s1);
    }
}