package classWork18_06;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("2 number");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
