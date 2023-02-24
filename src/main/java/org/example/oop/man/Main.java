package org.example.oop.man;

//Создать класс Man (человек). Он содержит 4 поля: String имя, String должность, int возраст, double рост.
// Все поля private, проинициализировать все поля в конструкторе.
//
//        В классе Main вам дана строка: “Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.”
//        Необходимо распарсить строку, то есть вытащить из нее данные и сохранить в переменные.
//
//        Создать объект Man, в качестве параметров в конструктор передать данные полученные из строки.
//
//        Вывести на экран все значения переменных (вам понадобятся геттеры).
public class Main {
    public static void main (String[] args) {
        String str = "Это Иван, ему 34 года, его рост 166.3 см. Должность-програмист.";

//        Man man = new Man();
        String name = str.substring(4, 8);
        String post = str.substring(52, 62);
        int age = Integer.parseInt(str.substring(14, 16));
        double height = Double.parseDouble(str.substring(32, 38));

        Man man = new Man(name, post, age, height);

        System.out.println(man.toString());
    }
}
