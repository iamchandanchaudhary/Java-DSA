class Recursion {
    public static  void printSum(int i, int n, int sum) {
        if(i == n) {
            sum += i;
            System.out.println("Sum of N : " + sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }

    public static void main(String args[]) {

        // int i = 0;
        // int sum = 0;
        //int n = 0;
        printSum(1, 5, 0);
    }
}