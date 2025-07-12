class FirstPattern {
    public static void main(String args[]) {

        int n = 4;

        //upper loop 
        for(int i = 1; i <= n; i++) {
            //1st half
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            int space = 2*(n-i);
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //2nd half
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower loop 
        for(int i = n; i >= 1; i--) {
            //1st half
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            int space = 2*(n-i);
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //2nd half
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}