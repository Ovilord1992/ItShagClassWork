package itShagMyProject.dopDz;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String itog = (a % 2 == 0) ? "множество: " + a * b: "сложение: " + (a + b);
        System.out.println(itog);

    }
}
