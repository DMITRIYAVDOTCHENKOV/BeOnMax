package org.example.oop.human;

public class Main {
    public static void main(String[] args) {

    Humans humans1 = new org.example.oop.human.Humans("Dima", 34, 75.4);
    Humans humans2 = new org.example.oop.human.Humans("Nik", 25, 49.7);
    Humans humans3 = new org.example.oop.human.Humans("Den", 56, 90);
    Humans humans4 = new org.example.oop.human.Humans("Kris", 20, 65);
    Humans humans5 = new org.example.oop.human.Humans("Anna", 45, 63.9);



    double sgrtWeight = (humans1.getWeight() + humans2.getWeight() + humans3.getWeight() + humans4.getWeight()
    + humans5.getWeight()) / 5;

        System.out.println(humans1);
        System.out.println(humans2);
        System.out.println(humans3);
        System.out.println(humans4);
        System.out.println(humans5);


        System.out.printf("Средний вес людей: %f кг", sgrtWeight);
    }
}
