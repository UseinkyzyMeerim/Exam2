package exercise2;

public abstract class Vehicle {
  private String make;
  private Integer year;

  public Vehicle(String make, Integer year) {
    this.make = make;
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public Integer getYear() {
    return year;
  }

  public abstract void start();
    public abstract void stop();

  @Override
  public String toString() {
    return "Vehicle{" +
            "make='" + make + '\'' +
            ", year=" + year +
            '}';
  }
}

