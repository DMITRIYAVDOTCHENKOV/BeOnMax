package org.example.java4.multithreading.cyclicBarier;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long millis = (long) (Math.random() * 5000 + 1000);
                    String name = Thread.currentThread().getName();
                    System.out.println(name + ": Data is being prepared");
                    try {
                        Thread.sleep(millis);
                        System.out.println(name + ": Data is ready");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        cyclicBarrier.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(name + ": Continue work");
                }
            }).start();
        }
    }

}
