package org.example.streamAPI.lambada.filterMapColect;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<String> list = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .map((integer -> "Number: " + integer))
                .filter((string) -> string.endsWith("0"))
                .map((string) -> string + "!")
                .toList();

        for (String s : list) {
            System.out.println(s);
        }
    }

    private static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (Integer number : numbers) {
            result.add("Number: " + number);
        }
        return result;
    }
}