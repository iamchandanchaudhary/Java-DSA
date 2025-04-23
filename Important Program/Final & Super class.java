// Final class - cannot be extended
final class FinalClass {
    public void showMessage() {
        System.out.println("This is a final class.");
    }
}

// Superclass
class Animal {
    final String species = "Animal"; // final variable

    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    final void sleep() { // final method - cannot be overridden
        System.out.println("Animal sleeps...");
    }
}

// Subclass
class Dog extends Animal {

    void makeSound() {
        // Using super to call superclass method
        super.makeSound();
        System.out.println("Dog barks");
    }

    void displayInfo() {
        System.out.println("Species: " + super.species); // Using super to access final variable
    }

    // Cannot override final method 'sleep'
    // void sleep() {
    //     System.out.println("Dog sleeps...");
    // }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
        dog.displayInfo();

        // Uncommenting this will cause an error:
        // FinalClass fc = new FinalClass();
        // class AnotherClass extends FinalClass {} // Error: cannot inherit from final class
    }
}
