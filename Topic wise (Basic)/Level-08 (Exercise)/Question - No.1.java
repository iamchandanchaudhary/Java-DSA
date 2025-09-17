import java.util.*;

class FirstFunction {
    public static int calculateAverage(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = calculateAverage(a, b, c);
        System.out.println("Average of these no. : " + avg);
    }
}