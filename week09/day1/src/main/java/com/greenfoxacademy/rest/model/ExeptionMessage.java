package com.greenfoxacademy.rest.model;

public class ExeptionMessage {
    private String error;

    public ExeptionMessage() {

    }

    public ExeptionMessage(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
