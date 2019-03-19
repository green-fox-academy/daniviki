package com.greenfoxacademy.rest.model;

public class ArrayHandler_array {
    private int[] numbers;
    private int[] result;

    public ArrayHandler_array() {
    }

    public ArrayHandler_array(int[] numbers) {
        this.numbers = numbers;
        this.result = result;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    public void  doubleElements(int[] numbers) {
        for( int i = 0; i < numbers.length; i++ ) {
            numbers[i] = numbers[i]*2;
        }
        setResult(numbers);
    }
}

