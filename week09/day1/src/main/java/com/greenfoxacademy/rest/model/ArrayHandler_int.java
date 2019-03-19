package com.greenfoxacademy.rest.model;

public class ArrayHandler_int {

    private int result;

    public ArrayHandler_int() {
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void sum() {

    }

    public void sum(int[] numbers) {
        Integer sum = 0;
        for(int num : numbers ) {
            sum += num;
        }
        setResult(sum);
    }

    public void multiply(int[] numbers) {
        Integer multipliedNum = 1;
        for(int num : numbers ) {
            multipliedNum *= num;
        }
        setResult(multipliedNum);
    }
}
