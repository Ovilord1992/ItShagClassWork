package ClassWork25_06;

public class test {
    public static void main(String[] args) {
        int i = 10;
        while (i>=0){
            if (i-- % 2 !=0) continue;
            else if (i==1) break;
            System.out.println(i);
        }
    }
}
