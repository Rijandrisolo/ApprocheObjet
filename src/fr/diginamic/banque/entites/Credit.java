package fr.diginamic.banque.entites;

public class Credit extends Operation{

    public String GetType(){
        return "Crédit";
    }
    public double GetMontant() {
        double vgetMontant = getMontantOperation();
        return vgetMontant;
    }

     public Credit(String vdateOperation, double vmontantOperation) {

            super(vdateOperation,vmontantOperation);

    }

}
