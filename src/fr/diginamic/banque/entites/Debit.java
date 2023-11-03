package fr.diginamic.banque.entites;

public class Debit extends Operation {

    public String GetType(){

        return "Débit";
    }

    public Debit(String vdateOperation, double vmontantOperation) {

        super(vdateOperation,vmontantOperation);

    }


}
