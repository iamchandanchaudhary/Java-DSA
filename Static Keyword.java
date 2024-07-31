class Student {
    String name;
    int age;
    static String school;

    public void studentInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("School : " + Student.school);
        System.out.println("Age : " + this.age + "\n");
    }
}
class OPPS {
    public static void main(String args[]) {
        System.out.println("Student Information :- \n");

        Student.school = "IPS";

        Student s1 = new Student();
        s1.name = "Chandan";
        s1.age = 17;

        Student s2 = new Student();
        s2.name = "Aman";
        s2.age = 22;

        s1.studentInfo();
        //System.out.println("School : " + s1.school + "\n");

        s2.studentInfo();
        //System.out.println("School : " + s2.school + "\n");
    }
}