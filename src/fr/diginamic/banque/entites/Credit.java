package fr.diginamic.banque.entites;

public class Credit extends Operation{

    public String getType(){
        return "Crédit";
    }
    public double getMontant() {
        double vgetMontant = getMontantOperation();
        return vgetMontant;
    }

     public Credit(String vdateOperation, double vmontantOperation) {

            super(vdateOperation,vmontantOperation);

    }

}
