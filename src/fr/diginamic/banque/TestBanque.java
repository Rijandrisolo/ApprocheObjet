package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte cpt1= new Compte("dffdffdf",250.00 );
        CompteTaux cptTaux =new CompteTaux("FRessai34",450.00,1.00);

        System.out.println(cptTaux);

    }
}
