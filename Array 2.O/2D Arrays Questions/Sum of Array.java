class FirstArray {
    public static void main(String args[]){
        System.out.println("Finding the Sum of 2nd row in 2D Arrays:- \n");

        int numbers[][] = {{2, 3, 4, 5}, {6, 7, 8, 9}, {7, 4, 2, 3}};

        int row = numbers.length;
        int col = numbers[0].length;

        int sum = 0;

        System.out.println("Your 2D Array: ");
        //output
        for(int i = 0; i < row; i++) { //rows
            for(int j = 0; j < col; j++) { //cols
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // sum of 2nd row
        for(int j = 0; j < col; j++) {
            sum += numbers[1][j];
        }

        System.out.println("Sum of 2nd Row: " + sum);
    }
}