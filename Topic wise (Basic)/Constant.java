class Constant {
    public static void main(String args[]) {
        System.out.println("Making value Constant :- \n");

        int a = 5;
        final int b = 10;

        a = 8;
        //b = 12;
        int sum = a + b;
        System.out.println("Sum : " + sum);
    }
}