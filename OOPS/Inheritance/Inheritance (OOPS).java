class Rectangle {
    String color;
    double area;

    public void rectangleInfo() {
        System.out.println("Color : " + this.color);
        System.out.println("Area : " + this.area + "\n");
    }
}
// Coping the Hole Class
class Triangle extends Rectangle {
    // int length;
    // int hight;

    // public void triangleParameter() {
    //     System.out.println("Length : " + this.length);
    //     System.out.println("Height : " + this.hight);
    //}
}
class OOPS {
    public static void main(String args[]) {

        System.out.println("Inheritance :- \n");

        Rectangle r1 = new Rectangle();
        r1.color = "Pink";
        r1.area = 115.2;

        // it copies the Property of Rectangle
        Triangle t1 = new Triangle();
        t1.color = "Green";
        // t1.length = 21;
        // t1.hight = 8;
        t1.area = 552.6;

        r1.rectangleInfo();
        t1.rectangleInfo();
        //t1.triangleParameter();
    }
}