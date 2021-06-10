package ItShagClassWork.ClassWork25_06;

import java.util.Random;
import java.util.Scanner;

//complit

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int calc = 0;


        for (int i = 0; i < n; i++) {
            Random r = new Random();
            a[i] = r.nextInt(33);
        }

        for (int k : a) {
            System.out.print(k + " ");
        }
        System.out.println("\n");

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] != 0 && a[i + 1] != 0 && a[i] != 0) {
                if (a[i] % a[i -1] == 0 && a[i] % a[i + 1] == 0) {
                    System.out.println("Индекс: " + i);
                    calc++;
                }
            }
        }
        if (calc == 0) System.out.println("-1 совпаденией нет");
    }
}
