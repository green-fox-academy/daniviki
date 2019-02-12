package toDoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ToDoList.Thing> things = new ArrayList<>();

        things.add(new Thing("shopping",false));
        things.add(new Thing("walking", false));
        things.add(new Thing("sleeping", false));
        things.add(new Thing("playing", false));
        things.add(new Thing("studying", true));
        things.add(new Thing("eating", true));
        things.add(new Thing("working", true));

        Collections.sort(things);

        for( ToDoList.Thing thing: things) {
            System.out.println(thing);
        }





    }
}