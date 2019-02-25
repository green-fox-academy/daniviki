package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircraft> allAircraft = new ArrayList<>();
    int ammo;
    int healthPoints;

    public Carrier(int ammo, int healthPoints ){
        this.ammo = ammo;
        this.healthPoints = healthPoints;
    }

    public void add() {

    }

    public void fill() {

    }

    public void fight() {

    }

    public String getStatus() {
        String status = "";
        for(Aircraft aircraft : allAircraft )
            status =

        return
    }
}
