package ItShagClassWork.classWork15_06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(maxMass(1,2,12,4,5,6,3));
    }

    private static int maxMass(int... a){
        Arrays.sort(a);
        return a[a.length - 1];
    }
}
