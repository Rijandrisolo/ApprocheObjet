package entites2;

import fr.entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adresse;

    /// Constructeur à vide

    public Personne() {

    }

    public Personne(String vnom, String vprenom) {
        this.nom = vnom;
        this.prenom = vprenom;

    }

    public Personne(String vnom, String vprenom, AdressePostale vadresse) {
        this.nom = vnom;
        this.prenom = vprenom;
        this.adresse = vadresse;
    }

    ///afficher majuscule

    public void afficherMajuscule() {
        System.out.println(nom.toUpperCase() +" "+ prenom);
    }
    //modifier nom  ////    doit être set correction
    public void changerNom(String vnom) {
        nom = vnom;
    }
    //modifier prenom     //modifier prenom  ////    doit être set correction
    public void changerPrenom(String vPrenom) {
        prenom = vPrenom;
    }
    //modifier adresse     //modifier adresse ////    doit être set correction
    public void changerAdresse(AdressePostale vAdresse) {
        adresse = vAdresse;
    }
    /// get Nom
    public String getNom() {

        return nom;
    }
    /// get preNom
    public String getpreNom() {

        return prenom;
    }
    /// get adresse
    public AdressePostale getAdresse() {

        return adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
