class Student {
    Student() {
        System.out.println("Student Information :- \n");
    }
    // Default Access Modifiers ==> it can Access form any class in the Same Code, But for another Program need to Use "Packege"
    String name;

    // Public Access Modifiers ==> it can Access from any Class & Another Program
    public String course;

    // Protected Access Modifiers ==> It can only use in the Class of Same Program  
    protected int roll;
    protected String email;

    // Private Access Modifiers ==> it cannot be access from outside of the Class
    private String passward;

    public void studentInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Course : " + this.course);
        System.out.println("Roll No. : " + this.roll);
        System.out.println("Email id : " + this.email);
        System.out.println("Passward : " + this.passward);
    }
}
class OOPS {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Chandan";
        s1.course = "BCA";
        s1.roll = 23001028;
        s1.email = "chandan@gmail.com";

        // Passward cannot be called Because it is "Private".
        //s1.passward = "XinG";

        s1.studentInfo();
    }
}