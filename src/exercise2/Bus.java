package exercise2;

public class Bus extends Vehicle{
    public Bus(String make, Integer year) {
        super(make, year);
    }



    @Override
    public void start() {
        System.out.println("Bus is started");

    }

    @Override
    public String toString() {
        return "Bus make: " + getMake() +
                "Year: " + getYear();
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopped");



    }
}
