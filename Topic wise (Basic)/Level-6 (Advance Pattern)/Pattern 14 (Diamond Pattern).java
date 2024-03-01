class FirstPattern {
    public static void main(String args[]) {

        int n = 4;

        //upper loop
        for(int i = 1; i <= n; i++) {
            //spaces
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //inner loop - 1st half
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //2nd half
            for(int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //upper loop
        for(int i = n; i >= 1; i--) {
            //spaces
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //inner loop - 1st half
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //2nd half
            for(int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}