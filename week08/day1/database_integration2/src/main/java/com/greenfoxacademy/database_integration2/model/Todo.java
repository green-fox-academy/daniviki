package com.greenfoxacademy.database_integration2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo() {

    }

    public Todo(String title) {
        this.title = title;
        this.isUrgent = false;
        this.isDone = false;
    }

    public Todo(String title, boolean isDone, boolean isUrgent) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        this.isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }
}
