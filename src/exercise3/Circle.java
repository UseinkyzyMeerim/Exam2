package exercise3;

public class Circle extends Shape{
    private Double radius;


    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double  perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
         return 2 * Math.PI * radius * radius;
    }
}
