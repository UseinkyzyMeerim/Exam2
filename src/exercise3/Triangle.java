package exercise3;

public class Triangle extends Shape{
    private Double side1;
    private Double side2;
    private Double side3;

    public Triangle(Double side1, Double side2, Double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double perimeter() {
        return  side1 + side2 + side3;
    }

    @Override
    public double area() {
        return 0.5 * side1 * side3;
    }
}
