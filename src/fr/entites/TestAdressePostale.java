package fr.entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adress = new AdressePostale(5,"Rue Rimbaud","34080","Montpellier");


        AdressePostale adress1 = new AdressePostale(1,"Avenue des Mirtilles","34080","Montpellier");

        ///changer en majuscules
        adress.changerMajVille();
        //setNumRue
        adress1.setNumeroRue(15);
        //setLibelleRue
        adress1.setLibelleRue("Rue de l'Orange");
        //setCodePostal
        adress1.setCodePostal("34010");
        //setVille
        adress1.setVille("Lyon");

        System.out.println("adress "+" "+adress.getNumeroRue()+" "+adress.getlibelleRue()+" "+adress.getCodePostal()+" "+adress.getVille());
        System.out.println(adress1.numeroRue+" "+adress1.libelleRue+" "+adress1.ville+" "+adress1.codePostal);


        ////////////


        System.out.println(adress1.numeroRue);
        System.out.println(adress.libelleRue);
    }
}
