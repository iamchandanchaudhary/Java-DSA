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
}
class OOPS {
    public static void main(String args[]) {
        System.out.println("Student Information :- \n");

        // 1st Student 
        Student s1 = new Student();
        s1.name = "Chandan";
        s1.age = 17;
        s1.roll_no = 2810;
        s1.course = "BCA";

        // 2nd Student
        Student s2 = new Student();
        s2.name = "Aman";
        s2.age = 22;
        s2.roll_no = 5654;
        s2.course = "BBA";

        // 3rd Student
        Student s3 = new Student();
        s3.name = "Akash";
        s3.age = 21;
        s3.roll_no = 4344;
        s3.course = "MBA";

        // 4th Student
        Student s4 = new Student();
        s4.name = "Anchal";
        s4.age = 16;
        s4.roll_no = 1432;
        s4.course = "Nursing";

        // Calling the Student Information
        s1.studentInfo();
        s2.studentInfo();
        s3.studentInfo();
        s4.studentInfo();
        //s5.studentInfo();
    }
}