package itShagMyProject.dopDz;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = scanner.nextInt();
        System.out.println("Введите y: ");
        int y = scanner.nextInt();
        if (x > 0 || y > 0) {
            System.out.println("Первая четверть");
        } else if (x < 0 || y > 0) {
            System.out.println("Вторая четверть");
        } else if (x < 0 || y < 0) {
            System.out.println("Третья четверть");
        } else {
            System.out.println("Четвертая четверть");
        }
    }
}
