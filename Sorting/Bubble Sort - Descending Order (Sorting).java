class Shorting {
    public static void main(String args[]) {

        System.out.println("Shorting :- \n");

        int arr[] = {2, 8, 4, 9, 1, 9, 2, 5};

        // Origenal Order 
        System.out.print("Origenal Order : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Bubble Short
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {

                // Swap
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("In Descending Order : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nThank You :)");
    }
}