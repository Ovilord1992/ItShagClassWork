package classWork18_06;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        int summ = 0;
        int iter = 0;

        System.out.println("2 number");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            summ = summ + i;
            iter++;
        }

        System.out.println("summ: " + summ + "\nmidl: " + summ / iter);

    }
}
