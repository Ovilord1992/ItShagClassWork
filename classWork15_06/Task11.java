package ItShagClassWork.classWork15_06;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(true, 1, 9, 3, 4, 5)));
    }

    private static int[] sort(boolean a, int... b) {
        Arrays.sort(b);
        if (!a) {
            int[] b2 = new int[b.length];
            for (int i = b.length - 1; i > 0; ) {
                for (int j = 0; j < b.length; j++) {
                    b2[j] = b[i];
                    i--;
                }
            }
            return b2;
        }
        return b;
    }
}
