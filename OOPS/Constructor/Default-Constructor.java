class Student {
    String name;
    int age;
    int rollno;
    String course;
    
    // Implementing Constructor
    Student() {
        System.out.println("Student Information:- ");
    }

    public void getInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll number: " + this.rollno);
        System.out.println("Course: " + this.course + "\n");
    }

}

class Test {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Chandan Chaudhary";
        s1.age = 18;
        s1.rollno = 230010;
        s1.course = "BCA";

        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Aman Verma";
        s2.age = 21;
        s2.rollno = 230011;
        s2.course = "BSc";

        s2.getInfo();

    }
}