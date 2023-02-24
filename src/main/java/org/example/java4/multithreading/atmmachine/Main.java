package org.example.java4.multithreading.atmmachine;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(2000);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.withdraw("Dimka", 200);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    thread1.join();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                atm.withdraw("Kolya", 1000);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    thread2.join();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                atm.withdraw("Anna", 500);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    thread3.join();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                atm.withdraw("Dan", 600);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
