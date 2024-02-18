class StudentClass {

public static class Student {
    String name;
    int age;
    int roll_no;
}
public static void main(String args[]) {
    System.out.println("Student Information :- \n");

    Student s1 = new Student();

    s1.name = "Chandn";
    s1.age = 17;
    s1.roll_no = 1028;

    System.out.println("Name : " + s1.name);
    System.out.println("Age : " + s1.age);
    System.out.println("Roll Number : " + s1.roll_no);

    Student s2 = new Student();
    s2.name = "Aman";
    s2.age = 20;
    s2.roll_no = 5654;

    System.out.println("Name : " + s2.name);
    System.out.println("Age : " + s2.age);
    System.out.println("Roll Number : " + s2.roll_no);
}
}