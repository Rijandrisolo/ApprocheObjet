package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        double cred = 0.00;
        double deb = 0.00;
        Credit cred1 = new Credit("21/10/2023", 150.00);
        Credit cred2 = new Credit("03/11/2023", 52.00);
        Debit deb1 = new Debit("22/10/2023", 250.00);
        Debit deb2 = new Debit("02/10/2023", 175.00);
        cred = cred1.getMontantOperation() + cred2.getMontantOperation();
        deb = deb1.getMontantOperation() + deb2.getMontantOperation();
        Operation[] tableau = new Operation[4];
        tableau[0] = cred1;
        tableau[1] = cred2;
        tableau[2] = deb1;
        tableau[3] = deb2;
        for (Operation tab : tableau) {
            System.out.println(tab);
        }

    }
}
