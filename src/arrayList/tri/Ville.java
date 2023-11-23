package arrayList.tri;

public class Ville  implements Comparable<Ville> {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    @Override
    public int compareTo(Ville autre) {

   /*int result = this.nom.compareTo(autre.getNom());
    return result;*/
        return this.nom.compareTo(autre.getNom());
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants
                ;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }
}

