package Shelter;

public class Cat extends Animal{
    public Cat(String name, boolean isHealthy) {
        super(name, isHealthy, (int)Math.random() * 5 + 1);
    }
}
