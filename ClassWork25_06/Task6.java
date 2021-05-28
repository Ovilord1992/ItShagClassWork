package ClassWork25_06;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10 - (-10))) + (-10);
        }

        for (int i = 0; i < array.length; i++){
            int j = 0;
            int count = 0;
            while (j < array.length){
                if (array[i] == array[j]){
                    count++;
                }
                j++;
            }
            if (count == 1){
                System.out.println("num: " + array[i] + " ind " + i);
            }
        }




    }
}
