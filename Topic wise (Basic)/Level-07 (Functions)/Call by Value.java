class FirstFunction {
    public static void swap(int a, int b) {
        
        // swaping
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped Value: ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    public static void main(String args[]) {
        System.out.println("Call by Value:- \n");

        int a = 10;
        int b = 15;

        swap(a, b); // Value Exchanged

        // Still Same
        System.out.println("\nStill Same: ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}