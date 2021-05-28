package itShagMyProject.dopDz;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = String.valueOf(scanner.nextInt());
        switch (a) {
            case ("1") -> System.out.println(1 + " - неудовлетворительно");
            case ("2") -> System.out.println(2 + " - неудовлетворительно");
            case ("3") -> System.out.println(3 + " - удовлетворительно");
            case ("4") -> System.out.println(4 + " - хорошо");
            case ("5") -> System.out.println(5 + " - отлично");
            default -> System.out.println("символ " + a + " не является отметкой");
        }
    }
}
