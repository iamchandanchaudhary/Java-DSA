class FirstArray {

    public static void transpose(int matrix[][]) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) { 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("2D Arrays:- \n");

        int matrix[][] = {{2, 3, 7}, {6, 7, 4}};

        int row = 2, col = 3;

        System.out.println("Original Array");
        transpose(matrix);

        int transpose[][] = new int[col][row];

        // transposing the array
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed Array: ");
        transpose(transpose);
    }
}