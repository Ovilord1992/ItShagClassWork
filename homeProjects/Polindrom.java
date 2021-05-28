package homeProjects;

public class Polindrom {
    public static void main(String[] args) {
        System.out.println("Проверка на полиндром: ");
        String a = "12221";
        String d = "";
        for (int i = a.length() - 1; i >= 0; i--){
             d = d + (Character.getNumericValue(a.charAt(i)));
            }
        if ((a.equals(d))) {
            System.out.println("Палиндром");
        } else {
            System.out.println("не палиндром");
        }
    }

    }

