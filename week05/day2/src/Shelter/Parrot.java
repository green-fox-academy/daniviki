package Shelter;

public class Parrot extends Animal {
    public Parrot(String name, boolean isHealthy) {
        super(name, isHealthy, (int)Math.random() * 10 + 4);
    }
}
