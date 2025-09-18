class FirstFunction {
    public static void main(String args[]) {
        System.out.println("Swaping:- \n");

        int a = 10;
        int b = 15;

        System.out.println("Original Value: ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // swaping
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped Value: ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}