package classWork18_06;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_4_2_slow {
    public static void main(String[] args) {
        System.out.println("num");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int o = 0;

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 2; i < n; i++) {
            set.add(i);
        }

        for (int j = 2; j < n; j++) {
            for (int l = n; l > j; l--) {
                if (l % j == 0 && l != j) {
                    set.remove(l);
                }
            }
        }

        for (int k : set) {
            System.out.println(k);
            o++;
        }

        System.out.println(o);
    }
}
