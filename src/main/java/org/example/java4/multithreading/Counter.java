package org.example.java4.multithreading;

public class Counter {
    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();
    private int value;
    private int value2;

    public void inc() {
        synchronized (monitor1){
            value++;
        }
    }

    public void dec() {
        synchronized (monitor1) {
            value--;
        }
    }

    int getValue() {
        return value;
    }
    public void inc2() {
        synchronized (monitor2){
            value2++;
        }
    }

    public void dec2() {
        synchronized (monitor2) {
            value2--;
        }
    }

    int getValue2() {
        return value2;
    }
}
