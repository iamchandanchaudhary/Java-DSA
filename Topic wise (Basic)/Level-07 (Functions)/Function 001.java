import java.util.*;

class FirstFunction {
    public static void printMyName(String name) {
        System.out.println("Your Name : " + name);
        return;
    }
    public static void main(String args[]) {

        System.out.println("Printing name with Function :- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = sc.next();

        printMyName(name); // Calling Function
    }
}