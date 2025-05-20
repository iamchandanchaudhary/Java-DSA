// Defining an interface
interface Animal {
    void makeSound();
}

// Implementing an interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
