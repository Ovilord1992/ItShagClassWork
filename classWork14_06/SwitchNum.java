package classWork14_06;

import java.util.Scanner;

public class SwitchNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 6 значное число");

        int numner = scanner.nextInt();

        char[] a = String.valueOf(numner).toCharArray();
        if (a.length == 6){
            char tmps = a[1];
            a[1] = a[4];
            a[4] = tmps;

            char tmp = a[0];
            a[0] = a[5];
            a[5] = tmp;

            System.out.println(a);
        }else {
            System.out.println("введено чесло больше или меньше 6 знаков");
        }



    }
}
