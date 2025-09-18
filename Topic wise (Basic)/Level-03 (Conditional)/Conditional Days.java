import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        System.out.println("Finding the Day with Number:- \n");
     
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day Number: ");
        int day = sc.nextInt();

        switch(day) {
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4 : System.out.println("Wednesday");
            break;
            case 5 : System.out.println("Thrusday");
            break;
            case 6 : System.out.println("Friday");
            break;
            case 7 : System.out.println("Saturday");
            break;
            default : System.out.println("Invalid Day :(");
        }
    }
}