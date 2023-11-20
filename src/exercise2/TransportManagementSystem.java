package exercise2;

public class TransportManagementSystem {
    public static void main(String[] args) {
        Car car = new Car("Luxes", 2021 );
        System.out.println(car.toString());
        car.start();
        car.start();
        Bike bike = new Bike("BMW", 2000 );
        System.out.println(bike.toString());
        bike.start();
        bike.stop();
        Bus bus = new Bus("Mercedes-Benz Sprinter 2", 2006 );
        System.out.println(bus.toString());
        bus.start();
        bus.stop();

    }
}
