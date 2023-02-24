package org.example.java4.multithreading;

import java.util.TreeMap;
import java.util.concurrent.*;

public class Executor2_1 {
    public static void main(String[] args) {
        /**
         * создаем экзекютер, в который передаем фабрику  потоков, которая из каждого потока, делает его потоком демон.
         */
        ExecutorService executorService = Executors.newFixedThreadPool(2, new ThreadFactory() {

            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.print(".");
                        Thread.sleep(400);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Future<String> futereName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "John";
            }
        });
        Future<Integer> futereAge = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(4000);
                return 33;
            }
        });
        try {
            String name = futereName.get();
            int age = futereAge.get();
            System.out.println("\nName: " + name + "\nAge: " + age);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
//                (new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                return "John";
//            }
//        });
    }
}


