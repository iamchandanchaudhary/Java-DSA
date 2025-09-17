class Test {
    public static void main(String[] args) {

        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y)); // 20
        int exp2 = (y * x / y + y * x / y); // 20

        System.out.println(exp1);
        System.out.println(exp2);
    }
}