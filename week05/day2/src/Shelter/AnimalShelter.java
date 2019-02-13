package Shelter;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    int budget;
    List<Animal> animals = new ArrayList<>();
    List<String> adopters = new ArrayList<>();

    public AnimalShelter(){
        this.budget = 50;
    }

    public int rescue(Animal name) {
        animals.add(name);
        return animals.size();
    }

    public int heal() {
        for(Animal animal : animals) {
            if (animal.isHealthy == false)
                if (animal.healCost < budget) {
                    animal.heal();
                    this.budget -= animal.healCost;
                    return 1;

            }
        }
        return 0;
    }

    public void addAdopter(String name) {
        adopters.add(name);
    }

    public void findNewOwner() {
        List<Animal> healthyAnimals = new ArrayList<>();
        for( Animal animal : animals ) {
            if (animal.isAdoptable() == true) {
                healthyAnimals.add(animal);
            }
        }
        int randomAnimal = (int) Math.random() * healthyAnimals.size();
        animals.remove(randomAnimal);
        int randomAdopter = (int) Math.random() * adopters.size();
        adopters.remove(randomAdopter);
    }

    public int earnDonation(int donation) {
        budget = budget + donation;
        return budget;
    }

    public String toString() {
        String status = "Budget: " + budget + ". There are: " + animals.size() + " animal(s) and "
                + adopters.size() + " potential adopter(s), ";
        for( Animal animal : animals ) {
                status += "\n" + animal.toString();
        }
        return status;

    }

}
