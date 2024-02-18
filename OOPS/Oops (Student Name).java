class Student {
    String name;
    int age;

    public void studentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Chandan";
        s1.age = 17;

        s1.studentInfo();
    }
}