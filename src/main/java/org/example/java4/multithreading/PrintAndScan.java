package org.example.java4.multithreading;

public class PrintAndScan {
    private final Object printMonitor = new Object();
    private final Object scanMonitor = new Object();


    public void scan(int count) {
        synchronized (scanMonitor) {
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(500);
                    System.out.println("Отсканировано " + count + " стр.");
                    count--;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void print(int count) {
        synchronized (printMonitor) {
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(500);
                    System.out.println("Отпечатано " + count + " стр.");
                    count--;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintAndScan printAndScan = new PrintAndScan();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printAndScan.scan(4);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printAndScan.print(5);

            }
        }).start();
    }
}
