package itShagMyProject.dopDz;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        int a = 0;
        while (a <= 3) {
            arr[a] = scanner.nextInt();
            a++;
        }
        System.out.println((arr[0] < arr[2] || arr[1] < arr[3]) ? "первый конверт вмещается во второй" :
                "первый конверт не вмещается во второй");
    }
}
