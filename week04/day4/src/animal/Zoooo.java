package animal;

public class Zoooo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile", 2,"female", "green");
        Mammal mammal = new Mammal("Koala",3, "male", "grey");
        Bird bird = new Bird("Parrot", 1, "male","blue");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    }
}