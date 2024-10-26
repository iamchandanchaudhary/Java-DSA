class Recursion {
    public static void sumofN(int n, int number) {
        if(n == 6) {
            System.out.println("Sum of N : " + number);
            return;
        }
        number += n;
        sumofN(n + 1, number);
    }
    public static void main(String args[]) {

        int n = 1;
        int number = 0;
        
        sumofN(n, number);
    }
}