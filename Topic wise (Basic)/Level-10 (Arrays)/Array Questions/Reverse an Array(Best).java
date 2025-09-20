class FirstArray {

    public static void reverseArray(int numbers[]) {
        int start = 0, end = numbers.length-1;

        while(start < end) {
            // swaping the start & end value
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        // Best Case -> Omega
        System.out.println("Reverse an Array(Best Case):- \n");

        int numbers[] = {14, 54, 12, 27, 10, 33};
        
        System.out.print("Original Array: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        reverseArray(numbers);

        System.out.print("Reverse Array: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}