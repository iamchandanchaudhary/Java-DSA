import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        System.out.print("Enter your Marks : ");

        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();
        
        if(Marks >= 85) {
            System.out.println("Your Grade = A*");
        }
        else if(Marks <= 84 || Marks >= 65) {
            System.out.println("Your Grade = B");
        }
        else if(Marks <= 64 || Marks >= 50) {
            System.out.println("Your Grade = C");
        }
        else if(Marks <= 49 || Marks >= 0) {
            System.out.println("Failled");
        }
        else if(Marks > 100 || Marks < 0) {
            System.out.println("Invalid");
        }
    }
}