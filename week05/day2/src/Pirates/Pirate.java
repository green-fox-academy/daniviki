package Pirates;

import java.sql.Struct;

public class Pirate {
    String name;
    int amountOfGold;
    int healthPoints;
    boolean isCaptain;
    boolean hasWoodenLegs;

    public Pirate(String name, boolean isCaptain, boolean hasWoodenLegs){
        this.name = name;
        this.healthPoints = 10;
        this.amountOfGold = 0;
        this.isCaptain = isCaptain;
        this.hasWoodenLegs = hasWoodenLegs;
    }

    public void work(){
        if (isCaptain == true) {
            amountOfGold += 10;
            healthPoints -= 5;
        }else {
            amountOfGold += 1;
            healthPoints -= 1;
        }
    }

    public void party(){
        if (isCaptain == true) {
            healthPoints += 10;
        }else {
            healthPoints += 1;
        }
    }

    public String introduce() {
        String status = "";
        if (hasWoodenLegs == true) {
            status = "Hello, I'm " + name + ". I have a wooden leg and " +
            amountOfGold + "golds.";
        }else {
            status = "Hello, I'm " + name + ". I still have my real legs and " +
            amountOfGold + "golds.";
        }
        return status;
    }

}
