package ItShagClassWork.Class08_06;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String[] a = scanner.nextLine().split(" ");
        System.out.println("введите искомое слово");
        String b = scanner.nextLine();
        int count = 0;

        for (String k:a) {
            if (k.contains(b)){
                count++;
            }
        }
        System.out.println(count);

    }
}
