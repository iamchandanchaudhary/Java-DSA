class ChangeNumber {
    // Function to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded function to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int intResult = add(5, 3);
        int intResultThree = add(5, 3, 2);

        System.out.println("Result with two integers : " + intResult);
        System.out.println("Result with three integers : " + intResultThree);
    }
}
