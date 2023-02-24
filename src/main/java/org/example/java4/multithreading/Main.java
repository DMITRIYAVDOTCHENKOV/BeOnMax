package org.example.java4.multithreading;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Без потоков.");
        Counter counter = new Counter();
        long before = System.currentTimeMillis();
        int barrier = 1004_000_000;
//        for (int i = 0; i < 1000; i++) {
//            counter.inc();
//        }
//        for (int i = 0; i < 1000; i++) {
//            counter.dec();
//        }
//        System.out.println(counter.getValue());
//        System.out.println("===================");
//        System.out.println(" ");
//        System.out.println("С потоками ");
//

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.inc();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.dec();
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.inc2();
                }
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < barrier; i++) {
                    counter.dec2();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getValue());
        System.out.println("=========");
        System.out.println(counter.getValue2());
        long after = System.currentTimeMillis();
        System.out.println("Time = " + (after - before));
    }
}
