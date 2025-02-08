abstract class Animal {
    Animal() {
        System.out.println("Creating Animal");
    }
    abstract void walks();
}
class Horse extends Animal {

    Horse() {
        System.out.println("Creates a Horse"); 
    }

    public void walks() {
        System.out.println("Horse : Walks on 4 Legs\n");
    }
}
class Birds extends Animal {
    public void walks() {
        System.out.println("Birds : Walks on 2 Legs");
    }
}
class OPPS {
    public static void main(String args[]) {

        Horse h1 = new Horse();
        h1.walks();

        Birds b1 = new Birds();
        b1.walks();
    }
}