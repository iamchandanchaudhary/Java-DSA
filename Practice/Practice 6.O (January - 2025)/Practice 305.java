class Person {
    String name;
    int age;
    int rollno;

    void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll no.: " + rollno + "\n");
    }

    void getInfo(int age, int rollno) {
        System.out.println("Age: " + age);
        System.out.println("Roll no.: " + rollno + "\n");
    }
}

class Student extends Person {

    void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll no.: " + rollno + "\n");
    }
}

class Overload {
    public static void main(String args[]) {

        Person p1 = new Person();
        p1.name = "Chandan Chaudhary";
        p1.age = 18;
        p1.rollno = 230010;

        Student s1 = new Student();
        s1.name = "ChanduBhaiii";
        s1.age = 20;
        s1.rollno = 2222;

        p1.getInfo();
        p1.getInfo(19, 1111);

        s1.getInfo();
    }
}