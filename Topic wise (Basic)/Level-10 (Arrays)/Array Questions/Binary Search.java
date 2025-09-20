class FirstArray {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;
        
        while(start <= end) {
            int mid = (start + end) / 2;

            // comparision
            if(numbers[mid] == key) { // found
                return mid;
            }

            if(numbers[mid] < key) { // move right
                start =  mid+1;
            } 
            else { // move left
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binay Search:- \n");

        int numbers[] = {2, 4, 5, 6, 8, 11, 12, 14, 15, 21};
        int key = 12;

        // System.out.println(binarySearch(numbers, key));

        int index = binarySearch(numbers, key);

        if(index == -1) {
            System.out.println("Not found");
        } 
        else {
            System.out.println("Found at Index: " + index);
        }
        
    }
}
