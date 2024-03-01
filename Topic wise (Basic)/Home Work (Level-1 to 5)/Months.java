import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        System.out.println("Enter month No. -");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;

        switch (n) {
            case 1 : System.out.println("Month Name : January");
            break;
            case 2 : System.out.println("Month Name : February");
            break; 
            case 3 : System.out.println("Month Name : March");
            break;
            case 4 : System.out.println("Month Name : April");
            break;
            case 5 : System.out.println("Month Name : May");
            break;
            case 6 : System.out.println("Month Name : June");
            break;
            case 7 : System.out.println("Month Name : July");
            break;
            case 8 : System.out.println("Month Name : August");
            break;
            case 9 : System.out.println("Month Name : September");
            break; 
            case 10 : System.out.println("Month Name : October");
            break;
            case 11 : System.out.println("Month Name : November");
            break;
            case 12 : System.out.println("Month Name : December");
            break;
            default : System.out.println("Invalid");
        }
    }
}