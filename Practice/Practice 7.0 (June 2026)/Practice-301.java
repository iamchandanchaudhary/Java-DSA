class FirstClass {
    public static void main(String args[]) {
        System.out.println("Type Casting:- ");

        int a = 15;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        System.out.println("\nType Casting:- ");
        int x = 15;
        double y = 28.5;

        System.out.println("X: " + (double)x);
        System.out.println("Y: " + (int)y);
    }
}