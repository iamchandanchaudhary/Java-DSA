interface Animal {
    // Interfaces does not Support Constructor
    int eyes = 2;
    void walks();

// ==> We cannot use Function here
    // public void eats() {

    // }
}
interface Herbivorus {
    void eats();
} 
class Cows implements Animal, Herbivorus {
    public void walks() {
        // Cows() {
        //     System.out.println("Creating a new Cow");
        // }

        System.out.println("Cows : Walks on 4 Legs");
    }
    public void eats() {
        System.out.println("Cows : They are Vegetarian\n");
    }
}
class Parrot implements Animal {
    public void walks() {
        System.out.println("Parrot : Walks on 2 Legs");
    }
}
class OOPS {
    public static void main(String args[]) {

        System.out.println("Animal Information :- \n");

        Cows c1 = new Cows();
        c1.walks();
        c1.eats();

        Parrot p1 = new Parrot();
        p1.walks();
    }
}