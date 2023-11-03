package utils;


import static java.lang.Integer.parseInt;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine ="12";
        int valeur = parseInt(chaine);
        int a = 10;
        System.out.println(Math.max(a, valeur));
        System.out.println("String en int : "+ valeur);
    }
}
