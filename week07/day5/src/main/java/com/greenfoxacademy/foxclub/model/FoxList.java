package com.greenfoxacademy.foxclub.model;

import java.util.Arrays;
import java.util.List;

public class FoxList {

    private List<Fox> foxes;

    public FoxList() {
        foxes.add(new Fox("Vuk", "duck", "milk", Arrays.asList("write HTML", "play a lot", "code in Java")));
        foxes.add(new Fox("Karak", "goose", "water", Arrays.asList("eat a lot and don't get fat",
                "talk to plants", "sleep with opened eyes")));
        foxes.add(new Fox("Foxi", "insect", "tea", Arrays.asList("play chess alone")));
        foxes.add(new Fox("Maxi", "drug", "alcohol", Arrays.asList("party all day", "take drugs")));
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void addFox(Fox fox) {
        this.foxes.add(fox);
    }

    public Fox getFox(String name) {
        for( Fox fox : this.foxes ) {
            if (fox.getName().equalsIgnoreCase(name)) {
                return fox;
            }
        }
        return null;
    }
}
