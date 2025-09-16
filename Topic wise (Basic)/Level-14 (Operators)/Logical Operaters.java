class FirstClass {
    public static void main(String args[]) {
        System.out.println("Logical Operator(&&, ||, !):- \n");

        int a = 10;
        int b = 12;
        int c = 15;

        // Logical AND (&&) Operator
        System.out.println("AND Operator:-");
        System.out.println("1st Condition: ");
        if((a < b) && (b > c)) { // 1 False & 1 True
            System.out.println("True");
        } else {
            System.out.println("Flase");
        }

        System.out.println("2nd Condition: ");
        if((a < b) && (b < c)) { // Both True
            System.out.println("True");
        } else {
            System.out.println("Flase");
        }

        System.out.println("3rd Condition: ");
        if((a > b) && (b > c)) { // Both Wrong
            System.out.println("True");
        } else {
            System.out.println("Flase");
        }

        // Logical OR (||) Operator
        System.out.println("\nOR Operator:-");
        System.out.println("1st Condition: ");
        if((a < b) || (b > c)) { // 1 False & 1 True
            System.out.println("True");
        } else {
            System.out.println("Flase");
        }

        System.out.println("2nd Condition: ");
        if((a < b) || (b < c)) { // Both True
            System.out.println("True");
        } else {
            System.out.println("Flase");
        }

        System.out.println("3rd Condition: ");
        if((a > b) && (b > c)) { // Both Wrong
            System.out.println("True");
        } else {
            System.out.println("Flase");
        }

        // Logical NOT (!) Operator
        System.out.println("\nNOT Operator:-");
        System.out.println("1st Condition: ");
        if(!(a < b)) {
            System.out.println("True");
        } else {
            System.out.println("Flase");
        }

        System.out.println("2nd Condition: ");
        if(!(a > b)) {
            System.out.println("True");
        } else {
            System.out.println("Flase");
        }
    }
}