package gardenapp;

public class Plant {
    String color;
    double amountOfWater;

    public Plant (String color) {
        this.color = color;
        this.amountOfWater = 0;
    }

    public void status() {

    }

    public void watering(double wateringWith) {

    }

    public boolean needsWater () {
      return true;
    }

}
