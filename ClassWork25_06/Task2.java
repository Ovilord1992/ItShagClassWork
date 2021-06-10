package ClassWork25_06;

import java.util.Arrays;

public class Task2 {

    public static int max = 0;

    public static void main(String[] args) {
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (50 - (-70))) + (-70);
        }

        findMax(array);
        findMin(array);

    }

    public static void findMax(int[] array) {
        Arrays.sort(array);
        max = array[array.length - 1];
        System.out.println(max);
    }

    public static void findMin(int[] array) {
        int min = array[0];
        System.out.println(min);
    }
}
