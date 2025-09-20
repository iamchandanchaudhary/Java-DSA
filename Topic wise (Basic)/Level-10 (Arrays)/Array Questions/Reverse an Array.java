class Firstnumbersay {
    public static void main(String args[]) {
        // Wrost Case -> Big O
        System.out.println("Reverse an numbersay:- \n");

        int numbers[] = {14, 54, 12, 27, 10, 33};

        System.out.print("Original numbersay: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int reverse[] = new int[numbers.length];

        // Storing the reverse value in another numbersay
        System.out.print("Reverse Value: ");
        for(int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length-1-i];
            System.out.print(reverse[i] + " ");
        }
        System.out.println();

        // Changing the value of numbersay
        System.out.print("New numbersay: ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = reverse[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}