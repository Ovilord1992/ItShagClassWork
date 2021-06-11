package ItShagClassWork.Class08_06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (10 - (-10))) + (-10);
        }

        for (int k: a){
            if (k % 2 == 0) a1++;
            if (k % 2 != 0) a2++;
            if (k < 0) a3++;
            if (k >= 0) a4++;
        }

        int[] d = new  int[a1];
        int[] g = new  int[a2];
        int[] o = new  int[a3];
        int[] l = new  int[a4];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int j = 0; j < d.length; j++) {
                    d[j] = a[i];
                }
            };
            if (a[i] % 2 != 0) g[i] = a[i];
            if (a[i] < 0) o[i] = a[i];
            if (a[i] >  0) l[i] = a[i];
        }

        System.out.println(Arrays.toString(d));


    }
}
