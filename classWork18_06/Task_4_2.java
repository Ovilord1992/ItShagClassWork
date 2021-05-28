package classWork18_06;

import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
        System.out.println("num");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean[] primeArray = new boolean[n];
        primeArray[0] = true;
        primeArray[1] = true;
        for (int i = 0; i < primeArray.length; i++) {
            if (!primeArray[i]) {
                for (int j = 2 * i; j < primeArray.length; j += i) {
                    primeArray[j] = true;
                }
            }
        }

        for (int i = 0; i < primeArray.length; i++) {
            if (!primeArray[i]) {
                System.out.println(i);
            }
        }

    }

}
