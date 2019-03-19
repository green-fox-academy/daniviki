package com.greenfoxacademy.test.model;

public class Groot {
    String received;
    String translated;

    public Groot() {
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public void translateGroot(String received) {
        setReceived(received);
        setTranslated("I am Groot!");
    }
}
