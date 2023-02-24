package org.example.java4.multithreading;

public class Counter {
    private int value;

    public void inc(){
        value++;
    }

    public void dec() {
        value--;
    }

    int getValue() {
        return value;
    }
}
