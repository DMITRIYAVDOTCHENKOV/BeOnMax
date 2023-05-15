package org.example.streamAPI.lambada;

public class Lambada {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(1)).start();
        new Thread(() -> System.out.println(2)).start();
    }
}
