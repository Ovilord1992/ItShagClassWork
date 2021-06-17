package ItShagClassWork.classWork15_06;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(summLen(1,10));
    }
    private static int summLen(int a, int b){
        int summ = 0;
        for (int i = a; i <= b ; i++) {
            summ += i;
        }
        return summ;
    }
}
