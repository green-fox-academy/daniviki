package toDoList;
import java.util.List;

public class ToDoList implements Comparable<ToDoList> {

    private String name;
    private boolean completed;

    public ToDoList(String name, boolean completed) {
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
    public int compareTo(ToDoList t) {
        if (completed == true && t.completed == false) {
            return -1;
        }
        if (this.completed == this.completed) {
            return this.name.compareTo(this.name);
        }
        return 1;
    }
}

