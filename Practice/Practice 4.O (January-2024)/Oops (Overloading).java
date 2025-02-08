class Student {

    String name;
    int roll;
    int age;

    public void studentInfo(String name) {
        System.out.println("Name : " + name);
    }
    public void studentInfo(int roll) {
        System.out.println("Roll Number : " + roll);
    }
    public void studentInfo(String name, int roll) {
        System.out.println("Student Information :- " + name + " & " + roll);
    }
    Student() {
    }
}

class OOPS {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Chandan";
        s1.roll = 23001028;
        s1.age = 17;

        s1.studentInfo(s1.name);
        s1.studentInfo(s1.name, s1.roll);
    }
}