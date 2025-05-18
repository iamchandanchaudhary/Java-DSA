class Power {
    public static void main(String args[]) {
        System.out.println("Find Power :- ");

        int x = 2; // value
        int n = 5; // power

        int power = 1;

        for(int i = 1; i <= n; i++) {
            
            power = power * x;
        }
        System.out.println("Value : " + power);
    }
}
