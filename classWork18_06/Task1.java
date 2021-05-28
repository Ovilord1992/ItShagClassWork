package classWork18_06;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //диапазон

        System.out.println("2 number");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
