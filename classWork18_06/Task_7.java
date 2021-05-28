package classWork18_06;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println("num");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String d = scanner.next();

        for (int i = 1; i <= a; i++) {
            System.out.println(d);
        }
    }
}
