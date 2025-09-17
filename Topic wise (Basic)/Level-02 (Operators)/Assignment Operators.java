class Operators  {
    public static void main(String[] args) {
        System.out.println("Assignment Operators:- \n");

        int a = 10;
        int b = 5;

        int c = a; // c = a = 10
        System.out.println("Equalsto Assignment: " + c);

        b += a; // b = b + a = 15
        System.out.println("Adds and assigns: " + b);

        c -= b; // c = c - b = -5
        System.out.println("Subtracts and assigns: " + c);

        b *= b; // b = b * b = 225
        System.out.println("Multiply and assigns: " + b);

        b /= a; // b = b / a = 22
        System.out.println("Divides and assigns : " + b);

        b %= a; // b = b % a = 2
        System.out.println("Modulus and assigns: " + b);

    }
}
