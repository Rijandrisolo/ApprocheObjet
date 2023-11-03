package fr.diginamic.banque.entites;

public class Compte {
    private String numCompte;
    private double solde;


    public  Compte(String vnumCompte, double vsolde){
        this.numCompte = vnumCompte;
        this.solde = vsolde;

    }

    @Override
    public String toString() {
        return
                "numCompte='" + numCompte + '\'' +
                ", solde=" + solde
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
