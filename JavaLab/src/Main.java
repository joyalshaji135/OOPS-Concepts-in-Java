import shapes.Rectangle;
import shapes.Triangle;
import shapes.Circle;

public class Main {
    public static void main(String[] args) {

        double length = 5.0;
        double width = 3.0;
        double base = 4.0;
        double height = 6.0;
        double radius = 2.0;

        Rectangle rectangle = new Rectangle(length, width);
        Triangle triangle = new Triangle(base, height);
        Circle circle = new Circle(radius);

        double rectangleArea = rectangle.getArea();
        double triangleArea = triangle.getArea();
        double circleArea = circle.getArea();

        System.out.println("Area of rectangle (length=" + length + ", width=" + width + "): " + rectangleArea);
        System.out.println("Area of triangle (base=" + base + ", height=" + height + "): " + triangleArea);
        System.out.println("Area of circle (radius=" + radius + "): " + circleArea);
    }
}
