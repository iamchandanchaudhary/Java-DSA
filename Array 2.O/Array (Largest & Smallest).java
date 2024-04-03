class Arrays {
    public static void main(String args[]) {
        System.out.println("Finding smallest & largest (Array) : \n");

        int arr[] = {4, 2, 9, 6, 1};
        int smallest = arr[0];
        int largest = arr[0];

        System.out.print("List : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
        System.out.println();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Smallest : " + smallest);
        System.out.println("Largest : " + largest);
    }
}