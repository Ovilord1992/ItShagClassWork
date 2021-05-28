package itShagMyProject.dopDz;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        int a = 1;
        while (a < 10){
            System.out.println(z + " x " + a + " = " + z * a);
            a++;
        }

    }
}

