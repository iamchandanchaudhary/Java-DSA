class FunctionOverloading {

    public static int intAdd(int a, int b) {
        return a + b;
    }

    public static double doubleAdd(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
    
        System.out.println("Overloading :- \n");

        int intSum = intAdd(5, 8);
        double doubleSum = doubleAdd(5.3, 3.8);

        System.out.println("Int Sum : " + intSum);
        System.out.println("Double Sum : " + doubleSum);
    }
}