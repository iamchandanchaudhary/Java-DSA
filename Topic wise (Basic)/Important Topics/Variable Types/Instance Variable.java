import java.io.*;

class Instance {

    // Declared Instance Variable
    public String name;
    public int i;
    public Integer I;

    public static void main(String[] args) {
        System.out.println("Instance Variable:- \n");

        // Object Creation
        Instance stu1 = new Instance();
        stu1.name = "Chandan Chaudhary";

        // Displaying O/P
        System.out.println("Student name: " + stu1.name);
        System.out.println("Default value for int is "+ stu1.i);
      
        // toString() called internally
        System.out.println("Default value for Integer is: "+ stu1.I);
    }
}