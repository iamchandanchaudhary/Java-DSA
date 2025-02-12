import java.util.*;

class Shape {
    String color;
    double area;

    public void getInfo() {
        System.out.println("Color: " + this.color);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public void rectInfo() {
        area = length * width;
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + this.area + "\n");
    }
}

class Square extends Shape {
    double side;

    public void squareInfo() {
        area = side * side;
        System.out.println("Side: " + this.side);
        System.out.println("Area: " + this.area + "\n");
    }
}

class Circle extends Shape {
    double radius;

    public void circleInfo() {
        area = 3.14 * (radius * radius);
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + this.area + "\n");
    }
}

class Main {
    public static void main(String args[]) {

        Rectangle r1 = new Rectangle();

        r1.color = "Blue";
        r1.length = 12;
        r1.width = 15;
        r1.getInfo();
        r1.rectInfo();

        Square s1 = new Square();

        s1.color = "Red";
        s1.side = 12;
        s1.getInfo();
        s1.squareInfo();

        Circle c1 = new Circle();

        c1.color = "Yellow";
        c1.radius = 7;
        c1.getInfo();
        c1.circleInfo();
    }
}