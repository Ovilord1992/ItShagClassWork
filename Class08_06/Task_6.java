package ItShagClassWork.Class08_06;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int k : a) {
            summ = summ + k;
        }

        System.out.println(summ + " сумма");
        System.out.println(summ / a.length + " среднее");
        System.out.println(Arrays.toString(a));


    }
}
