class Short {
    public static void main(String args[]) {
        System.out.println("Slection Short :- \n");

        int arr[] = {9, 3, 7, 1, 8, 0};

        System.out.print("Origenal Order : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Time Complaxity ==> O(n^2)
        // Selection Short
        for(int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // Swaping
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        // Output
        System.out.print("In Ascending Order : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nThank You :)");
    }
}