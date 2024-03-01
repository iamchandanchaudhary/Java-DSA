class FirstPattern {
    public static void main(String args[]) {

        int n = 5;

        //outer loop
        for(int i = 1; i <= n; i++) {
            //space
            int space = n-i;
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //first half
            for(int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            //second half
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}