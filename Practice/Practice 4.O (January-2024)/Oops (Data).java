class Pen {
    String colour;
    String type;
    double price;

    public void penInfo() {
        System.out.println("Color : " + this.colour);
        System.out.println("Type : " + this.type);
        System.out.println("Price : " + this.price + "\n");

    }
    Pen(Pen p4) {
        this.colour = p4.colour;
        this.type = p4.type;
        this.price = p4.price;
    }
    Pen() {

    }
}
class OOPS {
    public static void main(String args[]) {

        System.out.println("Pen Information :- \n");

        Pen p1 = new Pen();
        p1.colour = "Red";
        p1.type = "Ballpoint";
        p1.price = 10;

        Pen p2 = new Pen();
        p2.colour = "Blue";
        p2.type = "Gell";
        p2.price = 15;

        Pen p3 = new Pen();
        p3.colour = "Black";
        p3.type = "Gell";
        p3.price = 25;

        Pen p4 = new Pen(p1);

        p1.penInfo();
        p2.penInfo();
        p3.penInfo();
        p4.penInfo();
    }
}