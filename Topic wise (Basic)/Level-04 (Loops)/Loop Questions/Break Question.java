import java.util.*;

class FirstLoop {
    public static void main(String args[]) {
        System.out.println("Break Question:-");

        Scanner sc = new Scanner(System.in);

        for(int i = 1; ; i++) {
            System.out.print("\nEnter any Number: ");
            int num = sc.nextInt();
            
            if(num % 10 == 0) {
                break; // It will break the loop
            }
            System.out.println("Your Number: " + num);
        }
        System.out.println("\nYou are Exited from the loop beacuse you typed multiple of 10.");
    }
}