package ItShagClassWork.ClassWork25_06;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
            int[] a = {1, 2, 3, 2, 5, 2, 5, 6, 4, 1};

            Map<Integer, Integer> counter = new HashMap<>();
            for (int x : a) {
                int newValue = counter.getOrDefault(x, 0) + 1;
                counter.put(x, newValue);
            }

            System.out.println(counter);
    }
}
