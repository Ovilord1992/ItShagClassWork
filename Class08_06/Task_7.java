package ItShagClassWork.Class08_06;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите массив");
        int[] a = new int[10];

        int summ = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("введите число для поиска");
        int b = scanner.nextInt();

        for (int k: a) {
            if (k == b) summ++;
        }

        System.out.println(summ);
    }
}
