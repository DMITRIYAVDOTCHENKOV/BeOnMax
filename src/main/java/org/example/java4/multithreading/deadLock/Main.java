package org.example.java4.multithreading.deadLock;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000, 1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                account.trancferFrom1To2(300);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                account.trancferFrom2To1(500);
            }
        }).start();
    }
}
