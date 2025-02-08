abstract class Animal {
    abstract void walk();
    Animal() {
        System.out.println("Creating a Animal");
    }
    public void eats() {
        System.out.println("They Eats\n");
    }
}
class Tiger extends Animal {
    public void walks() {
        System.out.println("Tiger : Walks on 4 legs");
    }
    Tiger() {
        System.out.println("Created a Tiger");
    }
}
class Peacock extends Animal {
    public void walks() {
    System.out.println("Peacock : Walks on 2 legs");
    }
}
class OOPS {
    public static void main(String args[]) {

        Tiger t1 = new Tiger();
        //t1.walks();
        //t1.eats();
        
        Peacock p1 = new Peacock();
        //p1.walks();
        //p1.eats();
    }
}