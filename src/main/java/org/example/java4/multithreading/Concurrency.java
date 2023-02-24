package org.example.java4.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Concurrency {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                long before = System.currentTimeMillis();
                for (int i = 0; i < 100000 ; i++) {
                    list1.add(i);
                }
                    long after = System.currentTimeMillis();
                    System.out.println("Thread1 - " + (after - before));
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long before = System.currentTimeMillis();
                for (int i = 0; i < 100000 ; i++) {
                    list2.add(i);
                }
                long after = System.currentTimeMillis();
                System.out.println("Thread2 - " + (after - before));
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                long before = System.currentTimeMillis();
                for (int i = 0; i < 100000 ; i++) {
                    list3.add(i);
                }
                long after = System.currentTimeMillis();
                System.out.println("Thread3 - " + (after - before));
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(list3.size());
    }
}
