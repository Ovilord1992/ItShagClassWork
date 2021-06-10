package ItShagClassWork.ClassWork25_06;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            Random r = new Random();
            a[i] = r.nextInt(n) + (-2);
        }

        int[] b = a.clone();

        for (int k: a) {
            System.out.print(k + " ");
        }

        for (int value : a) {
            if(value < -1){
                count++;
            }
        }

        if (count > 0) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] < 0) {
                    b[j] = (b[j] * b[j]);
                }
            }
        }

        System.out.println("\n");
        for (int k: b) {
            System.out.print(k + " ");
        }
    }
}
