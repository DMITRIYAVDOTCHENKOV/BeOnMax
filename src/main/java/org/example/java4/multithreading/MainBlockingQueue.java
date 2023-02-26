package org.example.java4.multithreading;

public class MainBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    System.out.println("Counter " + i);
                    i++;
                    Runnable task = blockingQueue.take();
                    if (task != null) {
                        new Thread(task).start();
                    }
                }
            }
        }).start();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            blockingQueue.add(new Runnable() {

                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("-----" + index);
                }
            });
        }
    }
}
