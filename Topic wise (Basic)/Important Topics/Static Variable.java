import java.io.*;

class Static {
    
    // Declared static variable
    public static String geek = "Chandan Chaudhary";
  
    public static void main(String[] args) {
        System.out.println("Static Variable:-");

        // geek variable can be accessed without object
        // creation Displaying O/P Geeks.geek --> using the static variable
        System.out.println("Name: " + Static.geek);

        // static int c = 0;
        // above line, when uncommented,
        // will throw an error as static variables cannot be declared locally.
    }
}