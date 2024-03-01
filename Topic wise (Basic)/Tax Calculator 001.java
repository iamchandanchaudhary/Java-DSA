import java.util.*;

class FirstClaculator {
    public static void main(String args[]) {

        System.out.println("Tax Claculator :- \n");

        for(int i = 1; ; i++) {

        System.out.print("Enter amount : ");
        Scanner sc = new Scanner(System.in);
        float m = sc.nextFloat();
        if(m == 00) {
            break;
        }

        System.out.print("Enter GST(%) : ");
        float n = sc.nextFloat();
        
        float tax = m + (m * n);
        System.out.println("\nFinal Price : " + tax);

        System.out.println("Thank you :)\n");

        }
        System.out.println("End of the program!\n");
    }
}