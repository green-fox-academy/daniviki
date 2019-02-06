package comparator;

import java.util.List;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing>, Printable {
    private String name;
    private boolean completed;

    public Thing(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing t) {
        if (completed == true && t.completed == false) {
            return -1;
        }
        if (this.completed == t.completed) {
            return this.name.compareTo(t.name);
        }
        return 1;
    }

    @Override
    public void printAllFields(List<Thing> thing) {
        for (Thing t : thing) {
            t.printAllFields();
        }
    }
}