class Functions {

    public static int sumofN(int n) {
         int sum = 0;

         for(int i = 1; i <= n; i++) {
            sum += i;
         }
         System.out.println("Sum : " + sum);
         return sum;
    }

    public static void main(String args[]) {
        int n = 5;

        sumofN(n);
    }
}