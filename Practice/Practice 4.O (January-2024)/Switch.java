import java.util.*;

class Switch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter week Number : ");
        int week = sc.nextInt();
        

        System.out.print("\nDay : ");
        switch(week) {
            case 1 : int number = sc.nextInt();
                        if(number == 1) {
                            System.out.println("Sunday");
                        } else if(number == 2) {
                            System.out.println("Ravivar");
                        }
                        else {
                            System.out.println("Invalid");
                        }

            case 2 : System.out.println("Monday");
            break;

            case 3 : System.out.println("Tuesday");
            break;

            case 4 : System.out.println("Wednesday");
            break;

            case 5 : System.out.println("Thursday");
            break;

            case 6 : System.out.println("Friday");
            break;

            case 7 : System.out.println("Saturday");
            break;

            default : System.out.println("Invalid ");
        }
    }
}