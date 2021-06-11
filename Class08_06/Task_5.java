package ItShagClassWork.Class08_06;

import java.util.Arrays;
import java.util.Locale;

public class Task_5 {
    public static void main(String[] args) {
        String q = "";
        String a = "практический опыт показы965вает, что повышение уровня гражданского созна67ния обеспечивает актуальность всесторонне сбалансированных нововведений. равным образом рамки и место обучения кадров представляет собой интересный эксперимент проверки системы масштабного изменения ряда параметров. Практический опыт показывает, что постоянный количественный рост и сфера нашей активности создаёт предпосылки качественно новых шагов для системы обучения кадров, соответствующей насущным потребностям. ";
        String[] b = a.split("\\. ");
        String[] n = a.split("");
        String[] x = a.trim().replaceAll("[0-9]", "").split("");
        String[] v = a.replaceAll("[,.:]", "").split("");

       for (String k: b){
           q = q + k.substring(0,1).toUpperCase() + k.substring(1) + ". ";
       }

        System.out.println(q);
        System.out.println(b.length + " предложений в тексте");
        System.out.println(n.length - x.length + " цифр в тексте");
        System.out.println(n.length - v.length + " знаков препинания в тексте");
    }
}
