class Student {
    String name;
    int age;
    int roll_no;

    public void printData() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Roll Number : " + this.roll_no + "\n");
    }
}

class OOPS {
    public static void main(String args[]) {
        System.out.println("Storing Student Data :- \n");

    // creating s1 Object
    Student s1 = new Student();

    // storing s1 data
    s1.name = "Chandan Chaudhary";
    s1.age = 17;
    s1.roll_no = 23124923;

    // creating s2 data
    Student s2 = new Student();
    s2.name = "Bijay Shankar";
    s2.age = 21;
    s2.roll_no = 23001028;

    // calling function
    s1.printData();
    s2.printData();

    }
}