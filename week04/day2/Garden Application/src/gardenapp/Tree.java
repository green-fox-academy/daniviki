package gardenapp;

public class Tree extends Plant{

    public Tree (String color) {
        super(color);
    }

    @Override
    public void status () {
        if (needsWater()) {
            System.out.println("The " + color + " Tree needs water.");
        }else {
            System.out.println("The " + color + " Tree doesnt need water.");
        }
    }

    @Override
    public void watering (double wateringWith) {
        if (needsWater()) {
            amountOfWater = (wateringWith * 0.4);
        }
    }
    @Override
    public boolean needsWater() {
            return amountOfWater < 10;
    }

}
