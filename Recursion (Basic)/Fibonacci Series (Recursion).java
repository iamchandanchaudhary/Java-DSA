class Recursion {
    public static void printFib(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);

        printFib(b, c, n-1);
    }
    public static void main(String args[]) {

        System.out.println("Fibonacci Series (Recursion) :- \n");

        int a = 0, b = 1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);

        printFib(a, b, n-2);
    }
}