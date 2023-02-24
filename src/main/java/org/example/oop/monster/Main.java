package org.example.oop.monster;

public class Main {
    public static void main (String[] args) {
        Monster monster = new Monster();
        Monster monster1 = new Monster(3);
        Monster monster2 = new Monster(4, 5);
        Monster monster3 = new Monster(1, 4, 6);

        System.out.println(monster.toString());
        System.out.println(monster1.hands);
        System.out.println(monster2.toString());
        System.out.println(monster3.feet);


        monster1.voice();
        monster2.voice(3);
        monster3.voice(5,"Hello");
    }
}
