class Pen {
    String color;
    String type; // ballpen, gelpen

    public void write() {
        System.out.println("Writing on Book! \n");
    }
    public void penInfo() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class OOPS {
    public static void main(String args[]) {

    Pen pen1 = new Pen();
    pen1.color = "Red";
    pen1.type = "BallPen";

    pen1.write();
    pen1.penInfo();
    }
}