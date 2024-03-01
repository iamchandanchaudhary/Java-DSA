import java.util.*;

class FisrtFunctions {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 18) {
            System.out.println("He is not eligible to Vote");
        }
        else {
            System.out.println("He is eligible to Vote");
        }
    }
}