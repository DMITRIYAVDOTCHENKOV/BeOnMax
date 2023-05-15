package org.example.streamAPI.lambada;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<Integer> filtered = Filter.filter(numbers, a -> a % 5 ==0);
//        List<Integer> filtered = filter(numbers, new Predicate() {
//            @Override
//            public boolean test(int a) {
//                return a % 5 ==0 ;
//            }
//        });
        for (Integer i : filtered) {
            System.out.print(i + " ");
        }
    }
}

