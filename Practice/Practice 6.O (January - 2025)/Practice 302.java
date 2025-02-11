import java.util.*;

class Main {
    public  static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st value: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd value: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("There Sum: " + sum);

        if(sum % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}