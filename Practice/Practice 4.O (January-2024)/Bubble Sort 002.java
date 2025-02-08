class Shorting {
    public static void main(String args[]) {

        int arr[] = {21, 6, 3, 99, 76, 1, 44, 3};

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j <arr.length-i-1; j++) {
                
                if(arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // Output
        System.out.print("In Ascending Order :- ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}