package org.example.streamAPI.lambada;

public class Director {
    public String force(Worker worker, int count) {
        return worker.work(count);
    }

}
