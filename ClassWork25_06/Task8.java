package ItShagClassWork.ClassWork25_06;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] a = new char[n];


        for (int i = 0; i < n; i++) {
            Random r = new Random();
            a[i] = (char) (r.nextInt(26) + 'a');
        }

        Map<Character, Integer> counter = new HashMap<>();
        for (char x : a) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put((char) x, newValue);
        }

        for (char key : a) {
            System.out.print(key + " ");
        }

        counter.values().removeIf(key -> key < 3);
        System.out.println(counter);
        System.out.println("размерность массива: " + n);
    }
}
