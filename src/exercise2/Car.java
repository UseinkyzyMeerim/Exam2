package exercise2;

public class Car extends Vehicle{


    public Car(String make, Integer year) {
        super(make, year);
    }

    @Override
    public String toString() {
        return "Car make: " + getMake() +
                "Year: " + getYear();
    }
    @Override
    public void start() {
        System.out.println("Car is started");
    }



    @Override
    public void stop() {
        System.out.println("Car is stopped");



    }
}
