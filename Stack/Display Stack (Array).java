import java.util.*;

class Stacks {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print Stack :- \n");

        // 1st Stack
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        // Stack<Integer> s2 = new Stack<>();
        // while(s1.size() > 0) {
        //     s2.push(s1.pop());
        // }

        // with the help of Array
        int size = s1.size();

        int arr[] = new int[size];

        for(int i = (size-1); i >= 0; i--) {
            arr[i] = s1.pop();
        }

        System.out.print("Stack : ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            s1.push(arr[i]);
        }
        System.out.println("\n" + s1);
    }
}