import java.io.*;

class Static {
    
    // Declared static variable
    public static String name = "Chandan Chaudhary";
  
    public static void main(String[] args) {
        System.out.println("Static Variable:-");

        // name variable can be accessed without object
        // creation Displaying O/P Static.name --> using the static variable
        System.out.println("Name: " + Static.name);

        // static int c = 0;
        // above line, when uncommented,
        // will throw an error as static variables cannot be declared locally.
    }
}