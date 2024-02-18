class Pen {
    String color;
    String type; // ball or gel

    public void write() {
        System.out.println("Writing on a Copy :- \n");
    }
    public void penInfo() {
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type + "\n");
    }
}
class OOPS {
    public static void main(String args[]) {

        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "BallPoint";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Gel";

        pen1.write();

        pen1.penInfo();
        pen2.penInfo();        
    }
}