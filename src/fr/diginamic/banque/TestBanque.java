package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte cpt1= new Compte();
        //Compte cpt2= new Compte();
         cpt1.setNumCompte("dffdfdfdfdfdf");
         cpt1.setSolde(250.00);
        System.out.println(cpt1.getNumCompte() +" "+cpt1.getSolde());

    }
}
