package org.example.java4.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class ListInt {
    public static void main(String[] args) {
//        List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());
//        CountDownLatch countDownLatch = new CountDownLatch(2);
        List<Integer> numbers = new CopyOnWriteArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(100);
                            numbers.add(i);
                    }
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(100);
                            numbers.add(i);
                    }
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(numbers.size());
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }
    }
}
