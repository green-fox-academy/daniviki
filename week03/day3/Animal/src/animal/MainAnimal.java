package animal;

public class MainAnimal {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        Animal chicken = new Animal("chicken");
        Animal cow = new Animal("cow");
        dog.play();
        dog.stats();
        chicken.eat();
        chicken.stats();
        cow.drink();
        cow.stats();
    }

}

