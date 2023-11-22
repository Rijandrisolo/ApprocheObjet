package fr.diginamic.banque.entites;
/**
 *
 *
 *
 */
public class Debit extends Operation {

    public String getType(){

        return "Débit";
    }
    public double getMontant() {
       double vgetMontant = - getMontantOperation();
        return vgetMontant;
    }

    public Debit(String vdateOperation, double vmontantOperation) {

        super(vdateOperation,vmontantOperation);

    }


}
