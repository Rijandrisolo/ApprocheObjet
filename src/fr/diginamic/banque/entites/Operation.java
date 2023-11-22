package fr.diginamic.banque.entites;

public abstract class Operation {

    private String dateOperation;
    private double montantOperation;
    private double montant = 0.0;

    public Operation(String vdateOperation, double vmontantOperation) {
        this.dateOperation = vdateOperation;
        this.montantOperation = vmontantOperation;
    }

     abstract String getType();
     abstract double getMontant();

    @Override
    public String toString() {
        return  "date Operation='" + dateOperation + '\'' +
                ", montant Operation=" + montantOperation
                ;
    }

    public String getDateOperation() {

        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {

        this.dateOperation = dateOperation;
    }

    public double getMontantOperation() {

        return montantOperation;
    }

    public void setMontantOperation(double montantOperation) {

        this.montantOperation = montantOperation;
    }
}