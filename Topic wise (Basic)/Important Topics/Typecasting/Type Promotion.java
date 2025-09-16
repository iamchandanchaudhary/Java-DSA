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
        int c = b - a;
        System.out.println(c);

        // char d = b-a; // => Give ERROR 

        // ==> Rule 2
        int p = 15;
        float q = 15.6f;
        long r = 18;
        double s = 24;

        double sum = p + q + r + s;
        System.out.println(sum);
    }
}
