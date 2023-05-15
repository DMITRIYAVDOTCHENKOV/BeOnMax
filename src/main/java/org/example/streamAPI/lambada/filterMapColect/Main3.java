package org.example.streamAPI.lambada.filterMapColect;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 100 + 100));
        }
        List<String> list = numbers.stream()
                .filter((integer -> integer % 2 == 0 && integer % 5 == 0))
                .map((Math::sqrt))
                .map((sqrt) -> "Sqrt " + sqrt)
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