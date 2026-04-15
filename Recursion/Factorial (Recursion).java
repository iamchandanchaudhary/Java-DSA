class Program {
    public static int findFacto(int num) {
        if(num == 1) {
            return 1;
        }

        int facto = findFacto(num - 1);
        int facto1 = facto * num;
        return facto1;
    }
    public static void main(String[] args) {
        System.out.println("Find Factorial using Recursion:- \n");

        System.out.println(findFacto(5));
    }
}