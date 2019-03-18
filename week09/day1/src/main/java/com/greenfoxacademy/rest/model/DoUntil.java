package com.greenfoxacademy.rest.model;

import sun.applet.Main;

public class DoUntil {
    Integer until;
    String action;
    Integer result;

    public DoUntil() {
    }

    public DoUntil(String action, Integer until) {
        this.action = action;
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer doIt(String action, Integer until) {
        if (action.equalsIgnoreCase("sum")) {
            result = 0;
            for( int i = 1; i <= until ; i++ ) {
                result += i;
            }

        } else if (action.equalsIgnoreCase("factor")) {
            result = 1;
            for( int i = 1; i <= until; i++ ) {
                result = result * i;
            }
        }
        return result;
    }
}
