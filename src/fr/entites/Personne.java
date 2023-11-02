package fr.entites;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adresse;

    /// Constructeur à vide

    public Personne(){

    }
    public Personne( String vnom,String vprenom ){
        this.nom = vnom;
        this.prenom=vprenom;

    }

    public Personne( String vnom,String vprenom, AdressePostale vadresse ){
        this.nom = vnom;
        this.prenom=vprenom;
        this.adresse= vadresse;
    }




}