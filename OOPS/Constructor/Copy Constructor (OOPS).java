class Student {
    String name;
    int age;
    int roll_no;
    String course;

    public void studentInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Roll Number : " + this.roll_no);
        System.out.println("Course : " + this.course + "\n");
    }
// Copy Constructor
    Student(Student s5) {
        this.name = s5.name;
        this.age = s5.age;
        this.roll_no = s5.roll_no;
        this.course = s5.course;
    }
    Student() {

    }
}
class OOPS {
    public static void main(String args[]) {
        System.out.println("Student Information :- \n");

        Student s1 = new Student();
        s1.name = "Chandan";
        s1.age = 17;
        s1.roll_no = 2810;
        s1.course = "BCA";

        Student s2 = new Student();
        s2.name = "Aman";
        s2.age = 22;
        s2.roll_no = 5654;
        s2.course = "BBA";

        Student s3 = new Student();
        s3.name = "Akash";
        s3.age = 21;
        s3.roll_no = 4344;
        s3.course = "MBA";

        Student s4 = new Student();
        s4.name = "Anchal";
        s4.age = 16;
        s4.roll_no = 1432;
        s4.course = "Nursing";

    // Copy the Information of 1st Student (s1)
        Student s5 = new Student(s1);

        s1.studentInfo();
        s2.studentInfo();
        s3.studentInfo();
        s4.studentInfo();
        
    // Calling the Student Information
        s5.studentInfo();
    }
}