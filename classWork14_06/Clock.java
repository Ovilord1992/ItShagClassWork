package classWork14_06;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sys("Введите число: ");
        sys("количество часов 0 - 24");
        int oper = scanner.nextInt();

        if (oper >= 0 && oper < 6){
            sys("доброй ночи");
        }
        if (oper >= 6 && oper < 13){
            sys("доброе утро");
        }
        if (oper >= 13 && oper < 17){
            sys("добрый день");
        }
        if (oper >= 17 && oper < 24){
            sys("добрый вечер");
        }

    }

    public static void sys(String a){
        System.out.println(a);
    }

}
