class Person {
    String name;
    int age;
    String cast;
// Multupal Function with Same Name
    public void personInfo(String name) {
        System.out.println("Name : " + name);
    }
    public void personInfo(int age) {
        System.out.println("Age : " + age);
    }
    // public void personInfo(String cast) {
    //     System.out.println("Cast : " + cast); 
    // }
    public void personInfo(String name, int age) {
        System.out.println("Information : " + name + " & " + age);
    }
}
class OOPS {
    public static void main(String args[]) {

        Person s1 = new Person();
        s1.name = "Chandan";
        s1.age = 17;
        s1.cast = "OBC";

    // Calling Specific Function ==> For Specific Information
        s1.personInfo(s1.name);
        s1.personInfo(s1.name, s1.age);
        s1.personInfo(s1.age);
    }
}