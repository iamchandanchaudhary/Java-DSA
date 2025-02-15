class Student {
    String name;
    int age;
    int rollno;

    public void getInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll no.: " + this.rollno + "\n");
    }
}

class Base {
    public static void main(String[] args) {
        System.out.println("Student Information:- \n");
        
        Student s1 = new Student();
        s1.name = "Chandan Chaudhary";
        s1.age = 18;
        s1.rollno = 230010;

        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Aman Verma";
        s2.age = 21;
        s2.rollno = 250010;

        s2.getInfo();
    }
}