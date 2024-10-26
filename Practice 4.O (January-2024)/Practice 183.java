import java.util.*;

class Condition {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number == (++number)) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}