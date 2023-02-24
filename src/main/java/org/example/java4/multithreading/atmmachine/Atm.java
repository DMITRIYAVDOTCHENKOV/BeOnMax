package org.example.java4.multithreading.atmmachine;

public class Atm {
    private int amount;
    private final Object monitor = new Object();

    public Atm(int amount) {
        this.amount = amount;
    }

    public void withdraw(String name, int amount) {
        synchronized (monitor) {
            System.out.println(name + " подошел(а) к банкомату");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (amount <= this.amount) {
                this.amount -= amount;
                System.out.println(name + " вывел(а) " + amount);
                System.out.println("В банкомате осталось " + this.amount);
            } else {
                System.out.println("Не достаточно денег на счете, для " + name);
            }
        }
    }
}


