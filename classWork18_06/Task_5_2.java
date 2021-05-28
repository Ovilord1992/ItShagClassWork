package classWork18_06;

import java.util.Scanner;

public class Task_5_2 {
    public static void main(String[] args) {
        System.out.println("num");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0 && b == 0) System.out.println("Невозможно умножение на ноль");
        else {
            for (int i = 1; i <= b; i++) {
                System.out.println(a + " * " + i + " " + " = " + a * i);
            }
        }

    }
}
