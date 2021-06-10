package ClassWork25_06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (13 - 3) + 3);
        }
        System.out.println(Arrays.toString(a));
        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : a) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }

        System.out.println(counter);
        System.out.println("размерность массива: " + n);
    }
}
