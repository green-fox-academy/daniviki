package gardenapp;

public abstract class Plant {
    String color;
    double amountOfWater;

    public Plant (String color) {
        this.color = color;
        this.amountOfWater = 0;
    }

    public abstract void status();

    public abstract void watering(double wateringWith);

    public  boolean needsWater () {
      return true;
    }

}
