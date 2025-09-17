class FirstLoop {
    public static void main(String args[]) {
        int n = 4;
        int m = 5;
        //outerloop
        for( int i = 1; i <= n; i++) {
            //innerloop
            for( int j = 1; j <= m; j++ ) {
                System.out.print("*");
            } System.out.println();
        }
    }
}