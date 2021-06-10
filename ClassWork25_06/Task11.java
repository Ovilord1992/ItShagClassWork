package ItShagClassWork.ClassWork25_06;

import java.util.Scanner;
//complit

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int count = 0;
        String[] z = a.split("\\s+");
        for (String k: z) {
            count++;
        }
        System.out.println(count);
    }
}