package gardenapp;

public class Flower extends Plant {


    public Flower (String color) {
        super(color);
    }

    @Override
    public void status () {
        if (needsWater()) {
            System.out.println("The " + color + " Flower needs water.");
        }else {
            System.out.println("The " + color + " Flower doesnt need water.");
        }
    }

    @Override
    public void watering (double wateringWith) {
        if (needsWater()) {
            amountOfWater = (wateringWith * 0.75);
        }
    }

    @Override
    public boolean needsWater() {
        return amountOfWater < 5;
    }

}
