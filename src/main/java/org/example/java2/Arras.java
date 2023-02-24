package org.example.java2;

import java.util.Arrays;

public class Arras {
    public static void main(String[] args) {

    int [] number = new int[900];
        for (int i = 0; i < number.length ; i++) {
            number[i] = i + 100;
        }
        System.out.println(Arrays.toString(number));


    int [] number2 = new int[number.length];

        for (int i = 0, j = number.length - 1; i < number.length ; i++, j--) {
            number2[j] = number[i];
        }
        System.out.println(Arrays.toString(number2));
    }
}
