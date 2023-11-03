package fr.diginamic.banque.entites;

public class Credit extends Operation{

    public String GetType(){

        return "Crédit";
    }

      public Credit(String vdateOperation, double vmontantOperation) {

            super(vdateOperation,vmontantOperation);

    }

}
