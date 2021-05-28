package itShagMyProject.dopDz;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String z = (a < 100 && a > 40) ? "Число входит в диапазон от от 40 до 100" + "\nвы ввели: " + a :
                "Число не входит в диапазон от от 40 до 100" + "\nвы ввели: " + a;
        System.out.println(z);
    }
}
