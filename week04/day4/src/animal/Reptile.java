package animal;

public class Reptile extends Animal {
    public Reptile(String name, int age, String gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public String breed() {
        String breed = "laying eggs.";
        return breed;
    }
}
