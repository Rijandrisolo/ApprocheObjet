package fr.diginamic.banque.entites;

public class Operation {

    private String dateOperation;
    private double montantOperation;

    public Operation(String vdateOperation, double vmontantOperation) {
        this.dateOperation = vdateOperation;
        this.montantOperation = vmontantOperation;
    }

    @Override
    public String toString() {
        return  "dateOperation='" + dateOperation + '\'' +
                ", montantOperation=" + montantOperation
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