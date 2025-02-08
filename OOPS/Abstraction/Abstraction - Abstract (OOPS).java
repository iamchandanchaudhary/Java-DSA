abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("Creating a New Animal");
    }
    public void eats() {
        System.out.println("They Eats! \n");
    }
}
class Horse extends Animal {

    Horse() {
        System.out.println("Created a Horse");
    }
    public void walks() {
        System.out.println("Horse : Walks on 4 legs");
    }
}
class Chiken extends Animal {
    public void walks() {
        System.out.println("Chiken : Walks on 2 legs");
    }
}

class OOPS {
    public static void main(String args[]) {

        Horse horse1 = new Horse();

        horse1.walks();
        horse1.eats();

        Chiken chiken1 = new Chiken();
        chiken1.walks();
        chiken1.eats();
    }
}