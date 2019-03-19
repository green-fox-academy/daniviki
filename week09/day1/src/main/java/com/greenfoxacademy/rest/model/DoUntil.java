package com.greenfoxacademy.rest.model;

public class DoUntil {
    Integer until;
    Integer result;

    public DoUntil() {
    }

    public DoUntil(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public void sum() {
        Integer sum = 0;
        for( int i = 1; i <= until ; i++ ) {
            sum += i;
        }
        setResult(sum);
    }

    public void factor() {
        Integer factor = 1;
        for( int i = 1; i <= until; i++ ) {
            factor = factor * i;
        }
        setResult(factor);
    }
}
