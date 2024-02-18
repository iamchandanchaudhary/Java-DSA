class Student {
    String name;
        int age;
        int roll_no; 

    public void studentInfo() {
        System.out.println("Student Information :- \n");
    }

}
class OOPS {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Chandan";
        s1.age = 17;
        s1.roll_no = 2310;

        s1.studentInfo();
        System.out.println("Her Name : " + s1.name);
        System.out.println("Her Age : " + s1.age);
        System.out.println("Her Roll Number : " + s1.roll_no);
        
    }
}