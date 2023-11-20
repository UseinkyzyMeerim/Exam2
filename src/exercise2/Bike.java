package exercise2;

public class Bike extends Vehicle{

    public Bike(String make, Integer year) {
        super(make, year);
    }

    @Override
    public void start() {
        System.out.println("Bike is stared");
    }

    @Override
    public String toString() {
        return "Bike make: " + getMake() +
                "Year: " + getYear() ;
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");




    }
}
