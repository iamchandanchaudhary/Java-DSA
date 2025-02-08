import java.util.*;

class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search :- \n");

        Scanner sc = new Scanner(System.in);

        int numbers[] = {32, 12, 98, 33, 40, 56};

        // Original list
        System.out.print("Original List : ");
        for(int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Searching number
        System.out.print("Search Number : ");
        int key = sc.nextInt(); 
        int flag = 0;

        for(int i = 0; i < 6; i++) {
            if(key == numbers[i]) {
                flag = 1;
            }
        }

        System.out.println();
        if(flag == 1) {
            System.out.println("Number is present...");
        } else {
            System.out.println("Number is Absent...");
        }
    }
}