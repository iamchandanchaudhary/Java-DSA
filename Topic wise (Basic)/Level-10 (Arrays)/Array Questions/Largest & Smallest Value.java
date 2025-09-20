class FirstArray {
    public static void main(String[] args) {
        System.out.println("Find Largest Value:- \n");

        int numbers[] = {15, 21, 28, 42, 16};
        int largest = Integer.MIN_VALUE;  // - infinite
        int smallest = Integer.MAX_VALUE;  // + infinite

        System.out.print("Array: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        for(int i = 0; i < numbers.length; i++) {
            // finding largest value
            if(largest < numbers[i]) {
                largest = numbers[i];
            }

            // finding smallest value
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println("\nLargest Value: " + largest);
        System.out.println("Smallest Value: " + smallest);
    }   
}
