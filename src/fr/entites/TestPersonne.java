package fr.entites;

public class TestPersonne {
    public static void main(String[] args) {


        Personne pers1 = new Personne("Dupont","Arsène",new  AdressePostale(5,"Rue Rimbaud","34080","Montpellier"));

        Personne pers2 = new Personne("Lupin","Arsène",new  AdressePostale(5,"Rue Rimbaud","34080","Montpellier"));



        System.out.println( pers1.nom +" "+pers1.prenom+" "+pers1.adresse.numeroRue);
        System.out.println( pers2.nom +" "+pers2.prenom+" "+pers2.adresse.libelleRue);

    }
}
