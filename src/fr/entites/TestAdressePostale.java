package fr.entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale();
        adr1.NumeroRue = 5;
        adr1.LibelleRue = "Rue Rimbaud";
        adr1.CodePostal = "34080";
        adr1.Ville = "Montpellier";

        AdressePostale adr2 = new AdressePostale();
        adr2.NumeroRue = 1;
        adr2.LibelleRue = "Avenue des Mirtilles";
        adr2.CodePostal = "34080";
        adr2.Ville = "Montpellier";

        System.out.println( adr1.NumeroRue+" "+adr1.LibelleRue+" "+adr1.CodePostal+" "+adr1.Ville );
        System.out.println( adr2.NumeroRue+" "+adr2.LibelleRue+" "+adr2.CodePostal+" "+adr2.Ville );
    }
}
