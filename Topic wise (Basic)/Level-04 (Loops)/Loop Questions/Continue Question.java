import java.util.*;

class FirstLoop {
    public static void main(String args[]) {
        System.out.println("Continue Question:-");

        Scanner sc = new Scanner(System.in);

        for(int i = 1; ; i++) {
            System.out.print("\nEnter any Number: ");
            int num = sc.nextInt();
            
            if(num % 10 == 0) {
                System.out.println("Number Skipped because this number is multiple of 10.");
                continue; // It will skip the value
            }
            System.out.println("Your Number: " + num);
        }
    }
}