class FirstBits {
    public static void main(String args[]) {

        int n = 5;
        int pos = 2;

        int bitMask = 1<<pos;

        int notBitMask = ~(bitMask);
        int newName = notBitMask & n;

        System.out.println(newName);
    }
}