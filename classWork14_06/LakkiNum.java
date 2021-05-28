package classWork14_06;


public class LakkiNum {
    public static void main(String[] args) {
        String a = "123323";
        int summ = 0;
        int summ1 = 0;
        System.out.println(a.length());

        if (a.length() > 6 && a.length() < 6){
            sys("введенное число больше 6");
        }
        else if (a.length() == 6)
        {
            for (int i = 0; i <= a.length()-1; i++){
                if (i <= 2){
                    summ = summ + (Character.getNumericValue(a.charAt(i)));
                }
                if (i > 2){
                    summ1 = summ1 + (Character.getNumericValue(a.charAt(i)));
                }

            }
        }
        if (summ == summ1){
            sys("lacki");
        }else {
            sys("dont lacki");
        }

    }

    public static void sys(String a){
        System.out.println(a);
    }

}
