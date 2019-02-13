package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    String name;
    List<Pirate> pirates = new ArrayList<>();

    public Ship(String name) {
        this.name = name;
    }

    public void add(Pirate pirate){
        for(Pirate pirate1 : pirates ) {
            if (pirates.contains(pirate.isCaptain == true)) {
                System.out.println("This ship already has a Captain.");
            }else {
                pirates.add(pirate);
            }

        }
    }

    public List<Pirate> getPoorPirates() {
        List<Pirate> poorPirates = new ArrayList<>();
        for(Pirate pirate : pirates ) {
            if (pirates.isEmpty() == true) {
                System.out.println("There are no pirates on this ship.");
            }else if (pirate.amountOfGold < 15 && pirate.hasWoodenLegs == true ) {
                poorPirates.add(pirate);
            }
        }
        return poorPirates;
    }

    public void lastDayOnTheShip() {
        for( Pirate pirate : pirates) {
            pirate.party();
        }
    }

    public void prepareForBattle() {
        for( int i = 0; i < pirates.size(); i++ ) {
            for( int j = 0; j <= 5; j++ ) {
                pirates.get(i).work();
            }
        }
        lastDayOnTheShip();
    }
}
