package animal;

public class Mammal extends Animal {
    public Mammal(String name, int age, String gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public String breed() {
        String breed = "pushing miniature versions out.";
        return breed;
    }
}
