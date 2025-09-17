class Test {
    public static void main(String[] args) {

        int x = 200, y = 50, z = 100;

        if (x > y && y > z) { // false
            System.out.println("Hello");
        }

        if (z > y && z < x) { // true
            System.out.println("Java");
        }

        if ((y + 200) < x && (y + 150) < z) { // false
            System.out.println("Hello Java");
        }
    }
}