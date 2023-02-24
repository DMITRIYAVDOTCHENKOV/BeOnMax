package org.example.oop.dog;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Бультерер", "Бес", 3);
        Dog dog2 = new Dog("Колли", "Лесси", 3);
        Dog dog3 = new Dog("Дог", "Пушок", 3);
        Dog dog4 = new Dog("Хаски", "Рей", 3);

        System.out.println(dog1.info());
        dog2.toRun();

    }
}
