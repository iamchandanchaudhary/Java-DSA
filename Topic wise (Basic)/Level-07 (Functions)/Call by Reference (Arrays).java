class FirstArray {

    public static void update(int marks[], int nonChangeble) {

        nonChangeble = 10;

        for(int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }

    }
    public static void main(String args[]) {
        System.out.println("Call by Reference:- \n");

        int marks[] = {95, 93, 94, 98};
        int nonChangeble = 5;

        System.out.print("Original marks: ");
        for(int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        System.out.println("Variable: " + nonChangeble);

        update(marks, nonChangeble);

        System.out.print("Updated marks: ");
        for(int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " "); // change the value -> call by reference
        }

        System.out.println();

        System.out.println("Variable: " + nonChangeble); // dosen't change the value -> call by value

        // ==> Arrays are changeble & called call by reference
        // ==> variables are nonChangeble & called call by value
    }
}