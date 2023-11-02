package entites2;

import fr.entites.AdressePostale;

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
    ///afficher majuscule
    public void afficherMajuscule(){
                System.out.println(nom.toUpperCase() + prenom);
    }
    //modifier nom
    public void changerNom(String vnom){
        nom = vnom;
    }
    public void changerPrenom(String vPrenom){
        prenom = vPrenom;
    }


}