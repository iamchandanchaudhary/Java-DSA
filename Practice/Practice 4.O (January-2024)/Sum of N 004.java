class Recursion {
    public static void printSum(int i, int n, int sum) {
        if(i == n) {
            //sum += i;
            System.out.println("Sum of N : " + sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }

    public static void main(String args[]) {
        System.out.println("Calculating the Sum of N (with Recursion) :- \n");

        printSum(1, 6, 0);
    }
}