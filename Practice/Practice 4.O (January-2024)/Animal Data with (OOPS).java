class Animal {
    String name;
    String type;
    int lifeExpancy;
    int speed;
    int eyes;

    public void animalInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Type of Animal : " + this.type);
        System.out.println("Life Expancy : " + this.lifeExpancy);
        System.out.println("Speed(in km) : " + this.speed);
        System.out.println("Number of Eyes : " + this.eyes + "\n");
    }

    public static void main(String args[]) {
        System.out.println("Animal Information :- \n");

        // 1st animal
        Animal a1 = new Animal();
        a1.name = "Tiger";
        a1.type = "Carnivorous";
        a1.lifeExpancy = 40;
        a1.speed = 120;
        a1.eyes = 2;

        // 2nd animal
        Animal a2 = new Animal();
        a2.name = "Elephant";
        a2.type = "Harbivores";
        a2.lifeExpancy = 80;
        a2.speed = 20;
        a2.eyes = 2;

        // 3rd animal
        Animal a3 = new Animal();
        a3.name = "Lion";
        a3.type = "Carnivoros";
        a3.lifeExpancy = 35;
        a3.speed = 101;
        a3.eyes = 2;

        // calling function
        a1.animalInfo();
        a2.animalInfo();
        a3.animalInfo();

    }
}