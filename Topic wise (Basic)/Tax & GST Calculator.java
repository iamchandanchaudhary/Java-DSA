import java.util.*;

class FirstClaculator {
    public static void main(String args[]) {

        System.out.println("GST & Offer Calculator :- \n");

        Scanner sc = new Scanner(System.in);

        for(int i = 1; ; i++) {
        System.out.print("Enter Calculator type(1 or 2) : ");

        int cal = sc.nextInt();
        if(cal == 1) {
            /*
            if(cal == 00) {
                break;
            } */


        System.out.println("Tax Claculator :- \n");

        for(int j = 1; ; j++) {

        System.out.print("Enter amount : ");
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
        System.out.println("Calculator Quit!\n");
    }
        else if(cal == 2) {

            System.out.println("Offer Calculator : \n");
            for(int j = 1; ; j++) {

                System.out.print("Enter Current price : ");
                float x = sc.nextFloat();
                if(x == 00) {
                    break;
                }

                System.out.print("Enter off(%) : ");
                float y = sc.nextFloat();

                float offCal = x - (x * y);

                System.out.println("\nFinal price : " + offCal);

                System.out.println("Thank you :)\n");
            }
            System.out.println("Calculator Quit!\n");
        }
        else if(cal == 00) {
            break;
            //System.out.println("Invalid");
        }
        else {
            System.out.println("Invalid :(\n");
        }
    }
        System.out.println("End of the Program!\n");
    }
}