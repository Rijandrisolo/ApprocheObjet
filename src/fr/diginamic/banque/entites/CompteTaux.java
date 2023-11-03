package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    private double taux;

    public CompteTaux(String vnumCompte, double vsolde) {
        super(vnumCompte, vsolde);
        this.taux=taux;
    }

    @Override
    public String toString() {
        return
              super.toString()+
              "taux=" + taux
                ;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
