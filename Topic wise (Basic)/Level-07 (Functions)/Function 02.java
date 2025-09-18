import java.util.*;

class FirstFunction {

    // creating function
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String args[]) {
        System.out.println("Using Methods/Function:- \n");

        Scanner sc = new Scanner(System.in);
        String name = "Chandan Chaudhary";

        // calling function
        printMyName(name);
        printMyName("ChanduBhaiii");
        printMyName(name);
    }
}