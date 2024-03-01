import java.util.*;

class FirstFunction {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("A is greater");
        } else if(a < b) {
            System.out.println("B is greater");
        }
        else {
            System.out.println("Equal");
        }
    }
}