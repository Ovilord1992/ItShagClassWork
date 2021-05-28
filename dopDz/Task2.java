package itShagMyProject.dopDz;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int summ = 0;
        int iter = 0;
        while ((score = scanner.nextInt()) > 0 && score <= 10) {
            summ += score;
            iter++;
        }
        System.out.println(summ / iter);

//        while (true) {
//            int a = scanner.nextInt();
//            if (a > 0 && a < 11){
//                summ = summ + a;
//                iter++;
//            }else {
//                System.out.println(summ/iter);
//                break;
//            }
//        }

    }
}
