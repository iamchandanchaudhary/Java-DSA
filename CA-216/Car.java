class Car {
	String carName = "BMW";
	String ownerName = "Chandan Chaudhary";
	String color = "Blue";
	String brand = "BMW";
	int yearofManufac = 2023;
	String vehicalNumber = "AS4312";

	public void getInfo() {
		System.out.println("Name: " + this.carName);
		System.out.println("Owner: " + this.ownerName);
		System.out.println("Color: " + this.color);
		System.out.println("Brand: " + this.brand);
		System.out.println("Year of Manufacture: " + this.yearofManufac);
		System.out.println("Vehical Number: " + this.vehicalNumber);
	}
}

class Main {
	public static void main(String[] agrs) {
	
	Car c1 = new Car();
	c1.getInfo();
	}
}