package classWork18_06;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("2 number");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("Fizz Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else {
                System.out.println(i);
            }
        }

    }
}
