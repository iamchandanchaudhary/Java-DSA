class Student {
    String name;

    public void studentInfo() {
        System.out.println("Name : " + this.name);
    }
}
class OOPS {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Chandan Chaudhary";

        s1.studentInfo();
    }
}