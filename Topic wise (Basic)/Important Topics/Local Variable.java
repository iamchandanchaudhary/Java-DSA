import java.io.*;

class Local {
    
    public static void main(String[] args) {
        System.out.println("Local Variable:- \n");

        // x is a local variable
        int x = 10;

        // message is also a local variable
        String message = "Hello, from Chandan Chaudhary!";

        System.out.println("x = " + x);
        System.out.println("message = " + message);

        if (x > 5) {
            // result is a local variable
            String result = "x is greater than 5";
            System.out.println(result);
        }

        // Uncommenting the line below will result in a
        // compile-time error System.out.println(result);
        for (int i = 0; i < 3; i++) {
            String loopMessage = "Iteration " + i; // loopMessage is a local variable
            System.out.println(loopMessage);
        }

        // Uncommenting the line below will result in a
        // compile-time error
        // System.out.println(loopMessage);
    }
}