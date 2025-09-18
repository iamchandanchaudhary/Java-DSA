import java.util.*;

class FirstFunction {

    // passing parameter in to the function
    public static void printMyName(String name) {
        System.out.println("Your Name : " + name);
        return;
    }
    public static void main(String args[]) {

        System.out.println("Passing Parameter:- \n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = sc.next();

        printMyName(name); // Calling Function through parameter
    }
}