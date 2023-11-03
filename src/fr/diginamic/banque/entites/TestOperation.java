package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {

        double montantGlobal = 0.00;
        Credit cred1 = new Credit("21/10/2023", 150.00);
        Credit cred2 = new Credit("03/11/2023", 52.00);
        Debit deb1 = new Debit("22/10/2023", 50.00);
        Debit deb2 = new Debit("02/10/2023", 75.00);

        Operation[] tableau = new Operation[4];
        tableau[0] = cred1;
        tableau[1] = cred2;
        tableau[2] = deb1;
        tableau[3] = deb2;

        for (Operation tab : tableau) {
            if( tab.GetType() =="Crédit"){
                montantGlobal = montantGlobal+tab.getMontantOperation();
            }else {
                montantGlobal = montantGlobal-tab.getMontantOperation();
            }
            System.out.println(tab+" "+tab.GetType());

        }
        System.out.println("Le Montant global est : "+ montantGlobal);

    }
}
