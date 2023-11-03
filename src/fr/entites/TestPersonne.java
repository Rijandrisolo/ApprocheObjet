package fr.entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        ///instancation objet
        AdressePostale adress1 = new AdressePostale(5,"Rue Rimbaud","34080","Montpellier");
        AdressePostale adress2 = new AdressePostale(1,"Avenue des Mirtilles","34080","Montpellier");
        AdressePostale adress = new AdressePostale(1,"Avenue ","34000","Montpellier");

        Personne pers1 = new Personne("Dupont","Arsène", adress1);
        Personne pers2 = new Personne("Lupin","Arsène",adress2);
        Personne pers = new Personne("Dujardin","Jean");
        pers.adresse = adress2;

        //affichage majuscule
        pers1.afficherMajuscule();
        //changer nom
        pers2.changerNom("Aristide");
        //changer prénom
        pers.changerPrenom("Jean Louis");
        //changer adresse
        pers.changerAdresse(adress);
        System.out.println(pers.adresse.codePostal);

        //Afficher nom
        System.out.println(pers.getNom());
        //Afficher prenom
        System.out.println(pers.getpreNom());
        //utilisation get d'adresse
        System.out.println( "get et set adresse "+"\n\r"+ pers1.nom +" "+pers1.prenom+" \n" +
                "\r"+pers1.adresse.getNumeroRue()+" "+pers1.adresse.getlibelleRue()+" "+pers1.adresse.getCodePostal()+" "+pers1.adresse.getVille());
        ///Utilisation set adresse pour changer adresse de personne
            pers.adresse.setNumeroRue(452);
        System.out.println( "Changement numero rue par setNUmeroRue de la classe adresse \n\r"+pers.nom +" "+pers.prenom+" "+pers.adresse.getNumeroRue()+" "+pers.adresse.getlibelleRue()+" "+pers.adresse.getCodePostal()+" "+pers.adresse.getVille());
       //ancien
        System.out.println( pers2.nom +" "+pers2.prenom+" "+pers2.adresse.codePostal);
        System.out.println( pers.nom +" "+pers.prenom+" "+pers.adresse.libelleRue);
    }
}
