package ClassWork25_06;

import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Set set = new HashSet();

        for (int i : array) {
            set.add(i);
        }
        if (set.size() == array.length){
            System.out.println("все разные");
        }else {
            System.out.println("есть повторяющиеся");
        }
    }
}
