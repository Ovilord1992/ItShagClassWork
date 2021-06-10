package ClassWork25_06;


public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int a = 0;
        int b = 1;
        for (int i = 0; i < array.length; ++i) {
            int next = a + b;
            a = b;
            b = next;
            array[i] = b;
        }

        for (int k : array) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }

    }
}
