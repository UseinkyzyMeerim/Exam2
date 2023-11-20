package exercise3;

public class GeometryCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(6.0, 9.0);
        Triangle triangle = new Triangle(3.0, 3.0, 3.0);

        System.out.println("Circle perimeter: " + circle.perimeter() +
                          "\nCircle area: " + circle.area() +
                "\nRectangle perimeter: " + rectangle.perimeter() +
                         "\nRectangle area: " + rectangle.area() +
                "\nTriangle perimeter: " + triangle.perimeter() +
                        "\nTriangle area: " + triangle.area());

    }
}
