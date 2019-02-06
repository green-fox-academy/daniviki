package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();

        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(6, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);

        for( Domino domino: dominoes) {
            System.out.println(domino);
        }

        List<Thing> things = new ArrayList<>();

        things.add(new Thing("shopping",false));
        things.add(new Thing("walking", false));
        things.add(new Thing("sleeping", false));
        things.add(new Thing("playing", false));
        things.add(new Thing("studying", true));
        things.add(new Thing("eating", true));
        things.add(new Thing("working", true));

        Collections.sort(things);

        for( Thing thing: things) {
            System.out.println(thing);
        }

        



    }
}
