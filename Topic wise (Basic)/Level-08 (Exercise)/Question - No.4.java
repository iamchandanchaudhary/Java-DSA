import java.util.*;

class FirstFunction {
    public static double getCircumfrence(int radius) {
        double circumfrence= 2 * 3.14 * radius;
        return circumfrence;
    }
    public static void main(String args[]) {
        System.out.println("Enter Radius : ");

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        double circumfrence = getCircumfrence(radius);
        System.out.println("Circumfrence of a circle : " + circumfrence);
    }
}