// Hierarchical-Inheritance

class Shape {
    String colour;
    double area;

    public void shapeInfo() {
        System.out.println("Color : " + this.colour);
        System.out.println("Area : " + this.area);
    }
}
class Rectangle extends Shape {
    int length;
    int breath;

    public void rectangleInfo() {
        System.out.println("Length : " + this.length);
        System.out.println("Breath : " + this.breath);
    }
}
class Circle extends Shape {
    int radius;

    public void circleInfo() {
        System.out.println("Radius : " + this.radius);
    }
}
class Triangle extends Shape {
    int length;
    int breath;

    public void triangleInfo() {
        System.out.println("Length : " + this.length);
        System.out.println("Breath : " + this.breath);
    }
}
    // Shape() {

    // }

class OOPS {
    public static void main(String args[]) {

        System.out.println("==> Hierarchical Inheritance :- \n");

        System.out.println("1st Rectangle Info : ");
        Rectangle r1 = new Rectangle();
        r1.colour = "Red";
        r1.area = 155.5;
        r1.length = 51;
        r1.breath = 21;

        r1.shapeInfo();
        r1.rectangleInfo();

        System.out.println("\n2nd Rectangle Info : ");
        Rectangle r2 = new Rectangle();
        r2.colour = "Green";
        r2.area = 55.8;
        r2.length = 14;
        r2.breath = 7;

        r2.shapeInfo();
        r2.rectangleInfo();

        System.out.println("\nCircle Info : ");
        Circle c1 = new Circle();
        c1.colour = "Blue";
        c1.area = 188.9;
        c1.radius = 15;

        c1.shapeInfo();
        c1.circleInfo();

        System.out.println("\nTriangle Info : ");
        Triangle t1 = new Triangle();
        t1.colour = "Pink";
        t1.area = 311.2;
        t1.length = 22;
        t1.breath = 19;

        t1.shapeInfo();
        t1.triangleInfo();

    }
}
