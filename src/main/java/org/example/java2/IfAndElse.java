package org.example.java2;

import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во денег");
        int number = scanner.nextInt();
        if (number >= 500){
            System.out.println("Покупаем пиццу");
        }else if (number > 300 && number < 500){
            System.out.println("Давай купим шаурму");
        }else if (number > 100 && number < 300){
            System.out.println("Дучше давай купим Гамбургер");
        }else {
            System.out.println("Или лучше пошли за дошираком");
        }

    }
}
