class FirstFunction {
    // Function Overloading
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Overloading - different parameter
    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading - different datatypes
    public static float calculateSum(float a, float b) {
        return a + b;
    }

    // Overloading - different order of parameter
    public static float calculateSum(int a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println("Function Overloading:- \n");

        System.out.println("Function 1: " + calculateSum(15, 10));
        System.out.println("Function 2: " + calculateSum(10, 14, 15));

        System.out.println("Function 3: " + calculateSum(18.2f, 10.6f));
        System.out.println("Function 4: " + calculateSum(12, 16.4f));
    }
}