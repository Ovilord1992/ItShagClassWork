package ClassWork25_06;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 2, 1, 1, 1, 1, 1};
        Set set = new HashSet();

        for (int i : array) {
            set.add(i);
        }
        if (set.size() > 1) {
            System.out.println("Есть повторяющиеся");
        } else {
            System.out.println("все одинаковые");
        }
    }
}
