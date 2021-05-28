package classWork14_06;

import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sys("Введите количество метров: ");
        int a = scanner.nextInt();
        sys("введите операцию: ярды -> 3, дюймы -> 2, мили ->1");
        int oper = scanner.nextInt();

        switch (oper) {
            case (3) -> System.out.println(a / 1609 + " миль");
            case (2) -> System.out.println(a * 39 + " дюйм");
            case (1) -> System.out.println(a + " ярд");
            default -> sys("все не верно");
        }

    }

    public static void sys(String a){
        System.out.println(a);
    }
}
