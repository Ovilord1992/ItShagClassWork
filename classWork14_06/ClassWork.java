package classWork14_06;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sys("Введите число: ");
        int a = scanner.nextInt();
        sys("Введите число: ");
        int b = scanner.nextInt();
        sys("Введите число: ");
        int g = scanner.nextInt();
        sys("введите операцию: сумма -> 3, деление -> 2, умножение ->1");
        int oper = scanner.nextInt();

        switch (oper) {
            case (1) -> System.out.println(a * b * g);
            case (2) -> System.out.println(a / b / g);
            case (3) -> System.out.println(a + b + g);
            default -> sys("все не верно");
        }

    }

    public static void sys(String a){
        System.out.println(a);
    }
}
