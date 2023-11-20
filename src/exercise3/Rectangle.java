package exercise3;

public class Rectangle extends Shape{
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double perimeter() {
          return width * length;
    }

    @Override
    public double area() {
         return (width * length) * 2;
    }
}
