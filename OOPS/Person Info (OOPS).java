class Person {
    String name;
    int age;
    double height;

    public void personInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Height : " + this.height + "\n");
    }
    Person(String name, int age, double height) {
        //System.out.println("Person Information :- \n");

        this.name = name;
        this.age = age;
        this.height = height;
    }
// Copy Constructor 
    Person(Person s2) {
        this.name = s2.name;
        this.age = s2.age;
        this.height = s2.height;
    }
}
class OOPS {
    public static void main(String args[]) {
        //System.out.println("Person Information :- \n");

        Person p1 = new Person("Chandan", 17, 5.4);
        // p1.name = "Chandan";
        // p1.age = 17;
        // p1.height = 5.4;
// Copy the 1st Person Information
        Person p2 = new Person(p1);
        // p2.name = "Avinash";
        // p2.age = 16;
        // p2.height = 5.3;

        // Person p3 = new Person();
        // p3.name = "Vikram";
        // p3.age = 22;
        // p3.height = 5.6;

        p1.personInfo();
        p2.personInfo();
        // p3.personInfo();
    }
}