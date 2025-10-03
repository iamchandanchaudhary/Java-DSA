class Recursion {
    public static void printTable(int i, int value) {
        if(i == 11) {
            return;
        }
        System.out.println(value + " * "+ i + " = " + i * value);
        printTable(i+1, value);
    }

    public static void main(String args[]) {
        System.out.println("Table (Recursion) : \n");

        printTable(1, 4);

    }
}