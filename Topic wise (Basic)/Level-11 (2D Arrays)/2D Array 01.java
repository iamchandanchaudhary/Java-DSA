class FirstArray {
    public static void main(String args[]){
        System.out.println("2D Arrays:- \n");

        int numbers[][] = {{2, 3, 4, 5}, {6, 7, 8, 9}, {7, 4, 2, 3}};

        int row = numbers.length;
        int col = numbers[0].length;

        System.out.println("Your 2D Array: ");
        //output
        for(int i = 0; i < row; i++) { //rows
            for(int j = 0; j < col; j++) { //cols
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Value at index(1,2): " + numbers[1][2]);
    }
}