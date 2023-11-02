package fr.entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale();
        adr1.NumeroRue = 5;
        adr1.LibelleRue = "Rue Rimbaud";
        adr1.CodePostal = "34080";
        adr1.Ville = "Montpellier";

        System.out.println( adr1.NumeroRue+" "+adr1.LibelleRue+" "+adr1.CodePostal+" "+adr1.Ville );

    }
}
