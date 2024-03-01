class FirstBits {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;

        int bitMask = 1<<pos;

        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;

        System.out.println(newNumber);
        
        // if((notBitMask & n) == 0) {
        //     System.out.println("Zero");
        // } else {
        //     System.out.println("One");
        // }
    }
}