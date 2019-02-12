package Shelter;

public class Animal {
    String name;
    boolean isHealthy;
    int healCost;

    public Animal(String name, boolean isHealthy, int healCost) {
        this.name = name;
        this.isHealthy = isHealthy;
        this.healCost = healCost;
    }

    public void heal() {
        if (isHealthy == false) {
            isHealthy = true;
        }else {
            System.out.println(name + " is already healthy.");
        }
    }

    public boolean isAdoptable(){
        if (isHealthy == true) {
            return true;
        }else {
            return false;
        }
    }
    @Override
    public String toString(){
        String status;
        if (isHealthy == false) {
            status = name + " is not healthy, heal costs: " + healCost + "€" + ", and not adoptable.";
        }else {
            status = name + " is healthy, and adoptable";
        }
        return status;
    }
}
