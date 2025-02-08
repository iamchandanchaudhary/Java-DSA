class Vehical {
    String colour;
    int weels;

    public void vehicalInfo() {
        System.out.println("Color : " + this.colour);
        System.out.println("Weels : " + this.weels);
    }
}
class Car extends Vehical {
    String model;
    String name;

    public void carInfo() {
        System.out.println("Model : " + this.model);
        System.out.println("Name : " + this.name + "\n");
    }
    Vehical() {

    }
}
class OOPS {
    public static void main(String args[]) {
        System.out.println("==> Single Inheritance :- \n");

        System.out.println("Vehical Information : ");
        Vehical v1 = new Vehical();
        v1.colour = "Black";
        v1.weels = 4;

        v1.vehicalInfo();

        System.out.println("\nCar Information : ");
        Car c1 = new Car();
        c1.colour = "Red";
        c1.weels = 4;
        c1.model = "B6";
        c1.name = "BMW";

        Car c2 = new Car();
        c2.colour = "Blue";
        c2.weels = 4;
        c2.model = "B6";
        c2.name = "Tata";

        c1.vehicalInfo();
        c1.carInfo();
        c2.vehicalInfo();
        c2.carInfo();
    }
}