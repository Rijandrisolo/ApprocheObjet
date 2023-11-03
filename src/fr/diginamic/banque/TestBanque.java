package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte cpt1= new Compte("dffdffdf",250.00 );
        CompteTaux cptTaux =new CompteTaux("FRessai34",450.00,1.00);

        Compte[] tableau = new Compte[2];
        tableau[0] = cpt1;
        tableau[1] = cptTaux;

        for(Compte Cpte:tableau){
            System.out.println(Cpte);

        }

        /* for(int i=0;i<=tableau.length-1;i++){
            System.out.println(tableau[i]);

        }*/





    }
}
