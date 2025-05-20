import java.io.*;

class Student {
    
    // data members of the class
    String name;
    int id;
  
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("Parametrized Constructor:- \n");
        
        // This would invoke the parameterized constructor
        Student stu1 = new Student("ChanduBhaiii", 101);
        System.out.println("Name: " + stu1.name + " and Id: " + stu1.id);
    }
}