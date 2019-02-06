package animal;

public class Mammal extends Animal {
    public Mammal(String name, int age, String gender, String color, double weight) {
        super(name, age, gender, color, weight);
    }

    @Override
    public String breed() {
        String breed = "pushing miniature versions out.";
        return breed;
    }
}
