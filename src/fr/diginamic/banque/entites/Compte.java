package fr.diginamic.banque.entites;

public class Compte {
    private String numCompte;
    private double solde;


    public  Compte(String numCompte, double solde){
        this.numCompte = numCompte;
        this.solde = solde;

    }

    @Override
    public String toString() {
        return
                "numéro de Compte='" + numCompte + '\'' +
                ", Solde du Compte=" + solde+"€"
              ;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;

    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
