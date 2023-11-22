package fr.diginamic.chrono;

import java.util.Locale;

public class TestChrono {
    public static void main(String[] args) {

        ///  +
        long start = System.currentTimeMillis();
        String ch="";
        for (int i=0;i<100000;i++){
            ch=ch+i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Durée en ms méthode + :"+(end-start));
        ////   append
        long start1 = System.currentTimeMillis();
        String str1 = "Bonjour";
        String nom1 = "Jean";
        StringBuilder builder = new StringBuilder();
        String tout2="";
        for (int i=0;i<100000;i++) {
            builder.append(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Durée en ms méthode append:"+(end1-start1));


        ////   append
        long start2 = System.currentTimeMillis();
        String str2;
        for (int i=0;i<100000;i++) {
            str2 = String.format("Je suis %s %s et j'ai %d € en poche","Lee","Tim",i++ );
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Durée en ms méthode format:"+(end2-start2));


    }
}
