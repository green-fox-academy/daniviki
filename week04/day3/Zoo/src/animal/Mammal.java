package animal;

public class Mammal extends Animal {
    public Mammal(String niceName, int age, String gender, String color, double weight) {
        super(niceName, age, gender, color, weight);

    }

    @Override
    public String breed() {
        String breed = "pushing miniature versions out.";
        return breed;
    }
}
