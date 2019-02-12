package animal;

public abstract class Animal {
    String name;
    int age;
    String gender;
    String color;
    double weight;

    public Animal(String name, int age, String gender, String color, double weight){
        this.name = name + "Animal";
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();
}
