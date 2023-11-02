package fr.entites;

public class TestPersonne {
    public static void main(String[] args) {


        Personne pers1 = new Personne();
        AdressePostale adr1 = new AdressePostale();
        adr1.NumeroRue = 5;
        adr1.LibelleRue = "Rue Rimbaud";
        adr1.CodePostal = "34080";
        adr1.Ville = "Montpellier";
        ////
        pers1.Nom = "Dupont";
        pers1.Prenom = "Arsène";
        pers1.Adresse= adr1;


        Personne pers2 = new Personne();

        AdressePostale adr2 = new AdressePostale();
        adr2.NumeroRue = 1;
        adr2.LibelleRue = "Avenue des Mirtilles";
        adr2.CodePostal = "34080";
        adr2.Ville = "Montpellier";
        ////
        pers2.Nom = "Lupin";
        pers2.Prenom = "Arsène";
        pers2.Adresse= adr2;

        System.out.println( pers1.Nom +" "+pers1.Prenom+" "+pers1.Adresse.NumeroRue);
        System.out.println( pers2.Nom +" "+pers2.Prenom+" "+pers2.Adresse.LibelleRue);

    }
}
