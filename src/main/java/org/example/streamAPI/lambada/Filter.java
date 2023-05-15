package org.example.streamAPI.lambada;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
