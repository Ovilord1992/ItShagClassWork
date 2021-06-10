package ItShagClassWork.Class08_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int m = 0;
        int b = 0;
        int n = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (10 - (-10))) + (-10);
        }

        for (int k: a) {
            if (k == 0) n++;
            if (k > 0) b++;
            if (k < 0) m++;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.stream(a).max());
        System.out.println(Arrays.stream(a).min());

        System.out.println("нулей " + n);
        System.out.println("больше нуля " + b);
        System.out.println("меньше нуля " + m);

    }
}
