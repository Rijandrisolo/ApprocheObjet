package fr.diginamic.banque.entites;
/**
 *
 *
 *
 */
public class Debit extends Operation {

    public String GetType(){

        return "Débit";
    }
    public double GetMontant() {
       double vgetMontant = - getMontantOperation();
        return vgetMontant;
    }

    public Debit(String vdateOperation, double vmontantOperation) {

        super(vdateOperation,vmontantOperation);

    }


}
