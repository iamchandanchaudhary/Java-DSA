class FirstClass {
    public static void main(String args[]) {
        System.out.println("Triangle Pattern :- \n");
        int n = 5;

        for( int i = 1; i <= n; i++ ) {
            for( int j = 1; j <= n-i; j++ ) {
                System.out.print(" ");
            } for( int j = 1; j <= i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}