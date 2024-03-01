class FirstPattern {
    public static void main(String args[]) {

        int n = 4;

        //upper loop
        for(int i = 1; i <= n; i++) {
            //spaces
            int space = n - i;
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        //lower loop
        for(int i = n; i >= 1; i--) {
            //spaces
            int space = n - i;
            for(int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}