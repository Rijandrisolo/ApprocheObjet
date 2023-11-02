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
        System.out.println(nom.toUpperCase() + prenom);
    }


    //modifier nom doit être set
    public void changerNom(String vnom) {
        nom = vnom;
    }
    //modifier nom doit être set
    public void changerPrenom(String vPrenom) {
        prenom = vPrenom;
    }
    //modifier adresse doit être set
    public void changerAdresse(AdressePostale vAdresse) {
        adresse = vAdresse;
    }

    public String getNom() {

        return nom;
    }

    public String getpreNom() {

        return prenom;
    }

    public AdressePostale getAdresse() {

        return adresse;
    }
}
