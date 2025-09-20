import java.util.*;

class FirstCalculator {
    public static void main(String args[]) {

        System.out.println("Enter 1st No. : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        System.out.println("Enter 2nd no. : ");
        int b = sc.nextInt();

        System.out.println("Enter case : ");
        int operator = sc.nextInt();

        System.out.println("Answer : ");

        switch(operator) {
            case 1 : System.out.println(a + b);
            break;
            case 2 : System.out.println(a - b);
            break;
            case 3 : System.out.println(a * b);
            break;
            case 4 : if(b == 0) {
            System.out.println("Invalid Division");
            } else {
                System.out.println(a / b);
            }
            break;
            case 5 :if( b == 0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println(a % b);
            }
            break;
            default : System.out.println("Invalid Operator");
        }
    }
}