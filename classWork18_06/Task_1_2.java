package classWork18_06;

import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {
        System.out.println("num");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}
