package com.greenfoxacademy.rest.model;

public class Doubling {
    private Integer received;
    private Integer result;

    public Doubling(Integer received) {
        this.received = received;
        this.result = received * 2;
    }

    public Doubling() {

    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

}
