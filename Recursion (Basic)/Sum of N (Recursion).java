class Recursion {
    public static void printSum(int i, int n, int sum) {

        if(i == n) {
            sum += i;
            System.out.println("Sum of N : " + sum); 
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }

    public static void main(String args[]) {
        System.out.println("Find sum of N :- \n");
        int i = 1;
        int n = 6;
        int sum = 0;

        printSum(i, n, sum);
    }
}