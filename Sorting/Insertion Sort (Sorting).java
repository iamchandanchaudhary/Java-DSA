class Sorting {
    public static void main(String args[]) {

        System.out.println("Insertion Sort : \n");

        int arr[] = {3, 1, 9, 5, 8, 0, 2};

        System.out.print("Origenal Order : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Insertion Sort
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            // Placement
            arr[j+1] = current;
        }
        System.out.print("Ascending Order : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}