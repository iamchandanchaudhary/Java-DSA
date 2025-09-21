class FirstArray {

    public static void printArray(int matrix[][]) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) { 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("2D Arrays(Function):- \n");

        int matrix[][] = {{3, 8, 7}, {4, 7, 5}};

        System.out.println("2D Array: ");
        printArray(matrix);
    }
}