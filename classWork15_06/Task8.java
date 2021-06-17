package ItShagClassWork.classWork15_06;

public class Task8 {
    public static void main(String[] args) {
        summ(1,2,3,4,5);
    }

    private static void summ(int... a){
        int z = 0;
        for (int k: a) {
            z += k;
        }
        System.out.println(z);
    }
}
