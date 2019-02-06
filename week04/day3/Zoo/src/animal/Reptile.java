package animal;

public class Reptile extends Animal {
    public Reptile(String name, int age, String gender, String color, double weight) {
        super(name, age, gender, color, weight);
    }

    @Override
    public String breed() {
        String breed = "laying eggs.";
        return breed;
    }
}
