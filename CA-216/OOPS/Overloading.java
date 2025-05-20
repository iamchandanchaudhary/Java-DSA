class Overloading {
	double fingure(double l, double b) {
		return (l * b);
	}

	double fingure(int l, int b) {
		return ((l * b) / 2);
	}

	double fingure(int l, double b) {
		return (l * b);
	}

	double fingure(double l, int b) {
		return (2 * (l + b));
	}

	double fingure(int a) {
		return (4 * a);
	}

	public static void main(String args[]) {
		
	Overloading obj = new Overloading();
	
	System.out.println("Area of Rectangle: " + obj.fingure(5.55, 6.78));
	System.out.println("Area of Rectangle: " + obj.fingure(3, 5));
	System.out.println("Area of Rectangle: " + obj.fingure(4, 6.3));
	System.out.println("Paremeter of Rectangle: " + obj.fingure(6.3, 4));
	System.out.println("Area of Rectangle: " + obj.fingure(4));

	}
}