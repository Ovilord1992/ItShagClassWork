package ItShagClassWork.classWork15_06;

import java.math.BigInteger;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(nat(12));
    }
    private static boolean nat(int a){
        BigInteger bigInteger = BigInteger.valueOf(a);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(a));
        return probablePrime;
    }

}
