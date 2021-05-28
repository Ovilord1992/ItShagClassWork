package homeProjects;

import java.util.Scanner;

public class Shess {
    public static void main(String[] args) {
        /* вывести шахматную доску по заданым параметрам */

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество полей шахматной доски: ");

        int a = scanner.nextInt();

        for (int i = 0; i < a; i++){
            if (i % 2 != 0){
                System.out.print("\n" +  "   ");
            }else System.out.print("\n");
            for (int j = 0; j < a/2 ; j++){
                System.out.print("   #  ");
            }
        }
    }
}
