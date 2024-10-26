class Recursion {
    public static int calPower(int x, int n) {
        if(n == 0) {
            return 1; // Base Case 1
        }
        if(x == 0) {
            return 0; // base case 2
        }
        int xPowNm1 = calPower(x, n-1); // Actual Work
        int xPowN = x * xPowNm1;
        return xPowN;
    }
    public static void main(String args[]) {
        System.out.println("Power Calculation (Recursion) :- \n");

        // Value Deceleration
        int x = 2;
        int n = 5;

        // Calling 
        int ans = calPower(x, n);
        System.out.println("X^n = " + ans);
    }
}