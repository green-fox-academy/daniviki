package Shelter;

public class Dog extends Animal {
    public Dog(String name, boolean isHealthy) {
        super(name, isHealthy, (int)Math.random() * 8 + 1);
    }
}
