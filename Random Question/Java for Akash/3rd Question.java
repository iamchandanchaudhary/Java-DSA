class Car {
    String brand;
    String model;
    int year;
    double price;

    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
        price = 0.0;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Car defaultCar = new Car();

        System.out.println("Default Car:");
        defaultCar.displayInfo();
    }
}
