package classWork18_06;

import java.util.Scanner;

public class Task_2_2 {
    public static void main(String[] args) {
        System.out.println("num");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == 0 || j == a - 1 || i == 0 || i == a - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }


}
