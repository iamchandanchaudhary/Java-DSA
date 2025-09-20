class Main {
    public static void main(String args[]) {
        System.out.println("Print Table:-");

        for(int i = 1; i <= 10; i++) {
            System.out.print(i * 5 + " ");
        }

        int arr[] = {23, 21, 44, 56, 12};

        System.out.println();
        System.out.println(arr[0]);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}