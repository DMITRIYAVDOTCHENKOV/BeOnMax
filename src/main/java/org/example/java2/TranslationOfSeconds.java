package org.example.java2;

import java.util.Scanner;



public class TranslationOfSeconds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во секунд: ");

        long seconds = scanner.nextLong();
        long secondsInMinutes = 60;
        long secondsInHours = secondsInMinutes * 60;
        long secondsInDays = secondsInHours * 24;

        //Вычисляем количество дней - оно равно общему количеству секунд деленному на количество секунд в днях
        long days = seconds / secondsInDays;
        //Вычисляем количество часов - берем остаток от деления (из предыдущего действия) и делим его на количество секунд в часах
        long hours = (seconds % secondsInDays) / secondsInHours;
        //Вычисляем количество минут - берем остаток от деления (из предыдущего действия) и делим его  на количество секунд в минутах
        long minutes = ((seconds % secondsInDays) % secondsInHours) / secondsInMinutes;
        //Вычисляем количество секунд - берем общее количество секунд и вычитаем количество секунд, которое ушло на формирование дней, часов и минут
        long leftSeconds = seconds - days * secondsInDays - hours * secondsInHours - minutes * secondsInMinutes;
        //Выводим информацию на экран
        System.out.printf("Дано количество секунд: %d. Это равно:\n Дней %d\n Часов: %d\n Минут: %d\n Секунд: %d",
                seconds, days, hours, minutes,leftSeconds);
    }
}
