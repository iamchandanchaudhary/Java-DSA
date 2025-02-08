class StudentClass {

public static class Student {
    String name;
    int age;
}
public static void main(String args[]) {
    Student s1 = new Student();

    s1.name = "Name";
    s1.age = 17;

    System.out.println(s1.name);
    System.out.println(s1.age);
}
}