class Recursion {
    public static int calPower(int x, int n) {
        if(x == 0) {
            return 0; // Base case 1
        }
        if(n == 0) {
            return 1; // Base case 2
        }
        // n is Even
        if(n % 2 == 0) {
            return calPower(x, n/2) * calPower(x, n/2);
        }
        else { // n is Odd
            return calPower(x, n/2) * calPower(x, n/2) * x;
        }
    }
    public static void main(String args[]) {
        System.out.println("Calculating Power & Stack value LogN :- \n");

        int x = 2;
        int n = 5;

        int ans = calPower(x, n);

        System.out.println("x^n = " + ans);
    }
}