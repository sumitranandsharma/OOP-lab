// Parent class
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

// Child class 1
class Circle extends Shape {
    void areaOfCircle(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Child class 2
class Rectangle extends Shape {
    void areaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class Shapes {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display(); // from Shape
        c.areaOfCircle(5);

        r.display(); // from Shape
        r.areaOfRectangle(4, 6);
    }
}
