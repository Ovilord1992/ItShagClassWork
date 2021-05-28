package classWork18_06;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("num");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print("*");
        }
    }
}
