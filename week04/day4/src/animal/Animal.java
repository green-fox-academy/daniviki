package animal;

public abstract class Animal {
    String name;
    int age;
    String gender;
    String color;
    double weight;

    public Animal(String name, int age, String gender, String color){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();
}
