package org.example.oop.monster;

//Создать класс Монстр, с 3-мя полями типа int (кол-во глаз, ног и рук).
// Создать 4 конструктора (пустой, с 1-им параметром, 2-мя и 3-мя).
// Если в параметрах конструктора не устанавливается какое-то значение, то установить его равным 2.
//
//        Создать методы
//        void voice() - выводит на экран слово “Голос”
//        void voice(int i) - выводит слово голос i раз
//        void voice(int i, String word) - выводит слово word i раз
public class Monster {
    int eyes;
    int hands;
    int feet;

    public Monster (int eyes, int hands, int feet) {
        this.eyes = eyes;
        this.hands = hands;
        this.feet = feet;
    }

    public Monster (int eyes, int hands) {
        this.eyes = eyes;
        this.hands = hands;
        this.feet = 2;

    }

    public Monster (int eyes) {
        this.eyes = eyes;
        this.hands = 2;
        this.feet = 2;
    }

    public Monster () {
        this.eyes = 2;
        this.hands = 2;
        this.feet = 2;
    }

    void voice () {
        System.out.println("голос");
    }

    void voice (int i) {
        for (int j = 0; j < i; j++) {
            voice();
        }
    }

    void voice (int i, String word) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }

    @Override
    public String toString () {
        return "Monster{" +
                "eyes=" + eyes +
                ", hands=" + hands +
                ", feet=" + feet +
                '}';
    }
}
