package itShagMyProject.dopDz;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s == 12 || s == 1 || s == 2) {
            System.out.println("Зима");
        } else if (s == 3 || s == 4 || s == 5) {
            System.out.println("весна");
        } else if (s == 6 || s == 7 || s == 8) {
            System.out.println("лето");
        } else if (s == 9 || s == 10 || s == 11) {
            System.out.println("осень");
        } else {
            System.out.println("Не месяц");
        }

    }
}
