package gardenapp;
import java.util.ArrayList;
import java.util.List;

public class Garden {
    public static void main(String[] args) {

        List<Plant> plants = new ArrayList<>();
        Plant yellow = new Flower("yellow");
        plants.add(yellow);
        Plant blue = new Flower("blue");
        plants.add(blue);
        Plant purple = new Tree("purple");
        plants.add(purple);
        Plant orange = new Tree("orange");
        plants.add(orange);

        int thirstyPlants = countThirstyPlants(plants);

        for( Plant plant : plants) {
            plant.status();
        }
        System.out.println();

        for( Plant plant: plants ) {
            plant.watering(40 / thirstyPlants);
            plant.status();
        }
        System.out.println();

        thirstyPlants = countThirstyPlants(plants);

        for( Plant plant : plants ) {
            plant.watering(70 / thirstyPlants);
            plant.status();
        }
    }

    public static int countThirstyPlants(List<Plant> plants) {
        int thirstyPlantCounter = 0;
        for( Plant plant : plants ) {
            if (plant.needsWater() == true){
                thirstyPlantCounter++;
            }
        }
        return thirstyPlantCounter;
    }
}
