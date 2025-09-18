class FirstLoop {
    public static void main(String args[]) {
        System.out.println("Nested Loop:- \n");

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}