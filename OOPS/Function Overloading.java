class Student {
    String name;
    int age;
    int rollno;

    public void getInfo() {

        System.out.println("1st Function:- ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll no.: " + rollno + "\n");
    }

    public void getInfo(String name, int age) {

        System.out.println("2nd Function:- ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "\n");
    }

    public void getInfo(String name, int age, int rollno) {

        System.out.println("3rd Function:- ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll no.: " + rollno + "\n");
    }
}

class Function {
    public static void main(String[] args) {
        System.out.println("Function Overloading:- \n");
    
        Student stu1 = new Student();
        stu1.name = "Chandan Chaudhary";
        stu1.age = 18;
        stu1.rollno = 250010;

        stu1.getInfo();
        stu1.getInfo("Chandan Chaudhary", 18);
        stu1.getInfo("Chandan Chaudhary", 18, 230010);
    }
}