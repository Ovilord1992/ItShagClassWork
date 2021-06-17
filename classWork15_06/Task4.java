package ItShagClassWork.classWork15_06;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(max(1,2,3,4));
    }

    private static int max(int a, int b, int c, int d){
        int max = Math.max(Math.max(a,b), Math.max(c,d));
        return max;
    }
}
