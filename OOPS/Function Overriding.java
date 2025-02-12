class Person {
    String name;
    int age;
    int rollno;

    public void getInfo() {
        System.out.println("Parent Class:- ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll no.: " + rollno + "\n");
    }

}

class Student extends Person {
    
    public void getInfo() {
        System.out.println("Child Class:- ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll no.: " + rollno + "\n");
    }
}

class Function {
    public static void main(String[] args) {
        System.out.println("Function Overriding:- \n");
    
        Person per1 = new Person();
        per1.name = "Aman Chaudhary";
        per1.age = 19;
        per1.rollno = 250010;

        per1.getInfo();

        Student stu1 = new Student();
        stu1.name = "Chandan Chaudhary";
        stu1.age = 18;
        stu1.rollno = 230010;

        stu1.getInfo();
    }
}