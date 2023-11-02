package fr.entites;

public class AdressePostale {
    public int numeroRue;
    public String libelleRue;
    public String codePostal;
    public String ville;

    //Constructeur à vide
    public AdressePostale() {

    }
    public AdressePostale(int vnumeroRue,String vlibelleRue,String vcodePostal,String vville) {
    this.numeroRue =vnumeroRue;
    this.libelleRue = vlibelleRue;
    this.codePostal = vcodePostal;
    this.ville = vville;
    }

}