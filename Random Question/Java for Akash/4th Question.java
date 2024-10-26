class Car {
    String brand;
    String model;
    int year;
    double price;

    // Parameterized constructor
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 25000.50);

        System.out.println("My Car:");
        myCar.displayInfo();
    }
}
