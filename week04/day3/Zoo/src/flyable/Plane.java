package flyable;

public class Plane extends Vehicle implements Flyable {
    public Plane(String type, String color, int numberOfWheels) {
        super(type, color, numberOfWheels);
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }
}
