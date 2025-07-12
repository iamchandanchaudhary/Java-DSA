import java.util.*;

public class Solutions {
    public static boolean isElligible(int age) {
        if(age > 18) {
        return true;
    }   
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        System.out.println(isElligible(age));
    }
}
