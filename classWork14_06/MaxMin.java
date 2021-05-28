package classWork14_06;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sys("Введите число: ");
        int a = scanner.nextInt();
        sys("Введите число: ");
        int b = scanner.nextInt();
        sys("Введите число: ");
        int g = scanner.nextInt();
        sys("введите операцию: максимум -> 3, миниму -> 2, среднее ->1");
        int oper = scanner.nextInt();

        switch (oper) {
            case (3) -> System.out.println(Math.max(Math.max(a,b),g));
            case (2) -> System.out.println(Math.min(Math.min(a,b),g));
            case (1) -> System.out.println((a + b + g) - (Math.max(Math.max(a,b),g)+ Math.min(Math.min(a,b),g)));
            default -> sys("все не верно");
        }

    }

    public static void sys(String a){
        System.out.println(a);
    }
}
