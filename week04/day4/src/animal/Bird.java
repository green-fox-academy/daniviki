package animal;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name, int age, String gender, String color) {
        super(name, age, gender,color);
    }

    @Override
    public String breed() {
        String breed = "laying eggs.";
        return breed;
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
