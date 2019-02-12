package Shelter;

public class AnimalProtection {
    public static void main(String[] args) {

      AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.rescue(new Cat("Cica", true));
        animalShelter.rescue(new Dog("Furkesz", false));
        animalShelter.rescue(new Parrot("Papi", false));
        animalShelter.rescue(new Cat("Mica", false));
        animalShelter.rescue(new Dog("Murkesz", false));
        animalShelter.rescue(new Parrot("Gapi", true));

        System.out.println(animalShelter.toString());


        animalShelter.heal();
        animalShelter.heal();


        animalShelter.addAdopter("Huawei");
        animalShelter.addAdopter("Iphone");
        animalShelter.addAdopter("Samsung");
        animalShelter.addAdopter("Sony");


        System.out.println(animalShelter.toString());

        animalShelter.findNewOwner();

        System.out.println(animalShelter.toString());











        /*animalShelter.heal();
        System.out.println(animalShelter.toString());
        // Budget: 47€, There are 3 animal(s) and 0 potential adopter(s)
        // Cat is healthy and adoptable
        // Furkesz is not healthy (1€) and not adoptable
        // Parrot is not healthy (7€) and not adoptable

        animalShelter.addAdopter("Kond");
        System.out.println(animalShelter.toString());
        // Budget: 47€, There are 3 animal(s) and 1 potential adopter(s)
        // Cat is healthy and adoptable
        // Furkesz is not healthy (1€) and not adoptable
        // Parrot is not healthy (7€) and not adoptable

        animalShelter.findNewOwner();
        animalShelter.earnDonation(30);
        System.out.println(animalShelter.toString());
        // Budget: 77€, There are 2 animal(s) and 0 potential adopter(s)
        // Furkesz is not healthy (1€) and not adoptable
        // Parrot is not healthy (7€) and not adoptable

        System.out.println(animalShelter.toString());

        System.out.println("-----------------------------------------------------");
        animalShelter.heal();
        System.out.println(animalShelter.toString());
        animalShelter.heal();
        System.out.println(animalShelter.toString());
        animalShelter.heal();
        System.out.println(animalShelter.toString());
        animalShelter.heal();
        System.out.println(animalShelter.toString());*/



    }

}
