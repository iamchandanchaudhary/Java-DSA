class Animal {
    String name;
    String eat;
    
    // public void animalInfo() {
    //     System.out.println("They Eats!");
    // }
    
}
class Horse extends Animal {
    String walks;

    public void animalInfo() {
        System.out.println("They Eats!");
        System.out.println("Name : " + this.name);
        System.out.println("Walks : " + this.walks);
    }
}
class Tiger extends Horse {
    String categary;
    public void tigerInfo() {
        System.out.println("Categary : " + this.categary);
    } 
    
}
class Birds extends Horse {

}
class OOPS {
    public static void main(String args[]) {

        System.out.println("Animal Information :- \n");

        Horse h1 = new Horse();
        h1.name = "Chetak";
        h1.walks = "Walks on 4 Legs";

        Tiger t1 = new Tiger();
        t1.name = "Bageera";
        t1.walks = "Walks on 4 Legs";
        t1.categary = "Carnivorus";
        
        Birds b1 = new Birds();
        b1.name = "Parrot";
        b1.walks = "Walks on 2 Legs";

        System.out.println("About Horse :- ");
        h1.animalInfo();

        System.out.println("\nAbout Tiger :- ");
        t1.animalInfo();
        t1.tigerInfo();

        System.out.println("\nAbout Parrot :- ");
        b1.animalInfo();

    }
}