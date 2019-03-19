package com.greenfoxacademy.rest.model;

public class Append {
    String appended;
    Character appendLetter;

    public Append() {
    }

    public Append(String append) {
        this.appendLetter = 'a';
        this.appended = append + appendLetter;

    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }

    public Character getAppendLetter() {
        return appendLetter;
    }

    public void setAppendLetter(Character appendLetter) {
        this.appendLetter = appendLetter;
    }
}
