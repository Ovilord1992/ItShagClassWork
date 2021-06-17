package ItShagClassWork.classWork15_06;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(lack("123421"));
    }

    private static boolean lack(String a) {
        int summ = 0;
        int summ1 = 0;

        if (a.length() > 6 && a.length() < 6) {
            System.out.println("введенное число больше 6");
        } else if (a.length() == 6) {
            for (int i = 0; i <= a.length() - 1; i++) {
                if (i <= 2) {
                    summ = summ + (Character.getNumericValue(a.charAt(i)));
                }
                if (i > 2) {
                    summ1 = summ1 + (Character.getNumericValue(a.charAt(i)));
                }

            }
        }
        if (summ == summ1) {
            return true;
        } else {
            return false;
        }
    }
}
