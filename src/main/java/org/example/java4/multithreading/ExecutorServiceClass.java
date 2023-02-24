package org.example.java4.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Start - " + finalI);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Finish - " + finalI);
                    countDownLatch.countDown();
                }
            });
        }
        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All threads are terminates");
    }
}
