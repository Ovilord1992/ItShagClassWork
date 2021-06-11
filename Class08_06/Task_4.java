package ItShagClassWork.Class08_06;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().replace(" ", "").toLowerCase();
        String  str1 = new StringBuilder(str).reverse().toString();

        System.out.println((str.contains(str1) ? "Полиндром" : "Не полиндром"));








    }
}
