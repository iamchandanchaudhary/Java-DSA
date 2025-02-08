import Bank;

class Person {
    int age;
    int number;
    String DOB;

    public void personInfo() {
        System.out.println("Age : " + this.age);
        System.out.println("Number : " + this.number);
        System.out.println("DOB : " + this.DOB);
    }
}
class OPPS {
    public static void main(String args[]) {

        System.out.println("Person Information :- \n");
        Person p1 = new Person();
        p1.age = 17;
        p1.number = 77881234;
        p1.DOB = "19/05/2004";

        p1.personInfo();

        bank.Account acc1 = new bank.Account();
        acc1.name = "Chandan";

        //System.out.println(acc1.name);
    }
}