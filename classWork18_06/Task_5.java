package classWork18_06;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        int factor = 1;

        System.out.println("2 number");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            factor = factor * i;
        }

        System.out.println("factro: " + factor);
    }
}
