package ItShagClassWork.classWork15_06;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        rev(1,23,34,24,45,3,-3);
    }

    private static void rev(int... b){
        int pol = 0;
        int otr = 0;
        int ch = 0;
        int neCh = 0;
        for (int k:b) {
            if (k > 0){
                pol ++;
            }
            if (k < 0){
                otr ++;
            }
            if (k % 2 == 0){
                ch ++;
            }
            if (k % 2 != 0){
                neCh ++;
            }
        }
        System.out.printf("четные нечетные больше нуля меньше нуля %d %d %d %d", ch, neCh, pol, otr);
    }
}
