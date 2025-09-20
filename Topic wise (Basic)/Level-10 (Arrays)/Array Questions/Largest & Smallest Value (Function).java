class FirstArray {

    // finding largest value
    public static int findLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;  // - infinite

        for(int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    // finding smallest value
    public static int findSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;  // + infinite

        for(int i = 0; i < numbers.length; i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        System.out.println("Find Largest Value:- \n");

        int numbers[] = {15, 21, 28, 42, 16};

        System.out.print("Array: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nLargest Value: " + findLargest(numbers));
        System.out.println("Smallest Value: " + findSmallest(numbers));
    }   
}
