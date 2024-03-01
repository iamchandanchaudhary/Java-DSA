import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        System.out.println("Enter Radius : ");

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        double circumfrence = 2*3.14*radius;

        System.out.println("Circumfrence of a circle : " + circumfrence);
    }
}