class FirstPattern {
    public static void main(String args[]) {

        int n = 1; 

        //Upper Half
        for(int i = 1; i <= n; i++) {
            //1st Half
            for(int j = 1; j <= i; j++) {
                System.out.pint("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j = 1; j <= spaces; j++) {
                Sysrtem.out.print(" ");
            }
            //2nd half
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}