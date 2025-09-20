class FirstArray {
    public static int linearSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Linear Search:- \n");

        int arr[] = {15, 21, 28, 42, 16};
        int key = 42;

        int index = linearSearch(arr, key);
        if(index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at Index: " + index);
        }
    }   
}
