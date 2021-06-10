package ItShagClassWork.Class08_06;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task_9 {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (10 - (-10))) + (-10);
        }

        int m = 0;
        int ch = 0;
        int n = 0;
        int k3 = 0;
        OptionalInt min = Arrays.stream(a).min();
        OptionalInt max = Arrays.stream(a).max();

        System.out.println(Arrays.toString(a));

        for (int k: a) {
            if (k % 2 != 0) n = n + k;
            if (k % 2 == 0) ch = ch + k;
            if (k < 0) m = m + k;
        }

        for (int i = 0; i < a.length; i++) {
            if (i / 3 == 0){
                k3 = k3 + a[i];
            }
        }

        System.out.println("нечетные " + n);
        System.out.println("четные " + ch);
        System.out.println("отрицательных " + m);
        System.out.println("индекс кратный 3 произведение " + k3);


    }
}
