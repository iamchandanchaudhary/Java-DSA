class Short {
    public static void main(String args[]) {

        System.out.println("Shorting : \n");

        int arr[] = {65, 67, 21, 89, 44, 32, 11};

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {

                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}