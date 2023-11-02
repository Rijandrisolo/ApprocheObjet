package fr.entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adress = new AdressePostale();
        adress.NumeroRue = 5;
        adress.LibelleRue = "Rue Rimbaud";
        adress.CodePostal = "34080";
        adress.Ville = "Montpellier";

        AdressePostale adress1 = new AdressePostale();
        adress1.NumeroRue = 1;
        adress1.LibelleRue = "Avenue des Mirtilles";
        adress1.CodePostal = "34080";
        adress1.Ville = "Montpellier";


    }
}
