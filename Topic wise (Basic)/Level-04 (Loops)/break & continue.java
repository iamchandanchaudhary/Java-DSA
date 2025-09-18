class FirstLoop {
    public static void main(String args[]) {
        System.out.println("Break & Continue Statement:- \n");

        // Break Statement
        System.out.print("Loop 1 (break): ");
        for(int i = 1; i <= 10; i++) {
            
            if(i == 7) {
                break; // It will break the loop
            }
            System.out.print(i + " ");
        }
        System.out.println("...\nYou are Exited from the loop.");

        // Continue Statement
        System.out.print("\nLoop 2 (continue): ");
        for(int i = 1; i <= 10; i++) {
            
            if(i == 7) {
                continue; // it will skip the specific condition
            }
            System.out.print(i + " ");
        }
        System.out.println("\nYou Skip 7 from the loop.");
    }
}