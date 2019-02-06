package flyable;

public abstract class Vehicle {
    String type;
    String color;
    int numberOfWheels;

    public Vehicle(String type, String color, int numberOfWheels) {
        this.type = type;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }
}
