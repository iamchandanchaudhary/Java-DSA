class FunctionOverloadingExample {
    // Function to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded function to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
        int intResult = add(5, 3);
        double doubleResult = add(4.5, 2.3);

        System.out.println("Integer Result: " + intResult);
        System.out.println("Double Result: " + doubleResult);
    }
}
