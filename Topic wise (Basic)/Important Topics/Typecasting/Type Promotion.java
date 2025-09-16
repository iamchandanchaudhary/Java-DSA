import java.*;

class TypePromotion {
    public static void main(String[] args) {
        System.out.println("Typepromotion:- \n");

        // ==> Rule 1
        char a = 'a';
        char b = 'b';

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        System.out.println((int)(a));
        System.out.println((int)(b));

        System.out.println(b-a);

        // Type Promotion
        int ans = b - a;
        System.out.println(ans);

        // char d = b-a; // => Give ERROR 

        short m = 8;
        int n = 12;
        char o = 'c';

        byte bt = (byte)(m + n + o);
        System.out.println(bt);

        // ==> Rule 2
        int p = 15;
        float q = 15.6f;
        long r = 18;
        double s = 24;

        double sum = p + q + r + s;
        System.out.println(sum);

        byte x = 15;
        x = (byte)(x + 5);
        System.out.println(x);
    }
}
