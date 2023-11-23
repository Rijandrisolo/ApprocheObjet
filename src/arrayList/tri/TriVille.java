package arrayList.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TriVille {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        /// Tri ville par nom
        System.out.println("Tri ville par nom");
        Collections.sort(villes);

        for (Ville vil:villes) {

            System.out.println(vil);
        }
        System.out.println("Tri ville par Habitant");
        Collections.sort(villes, new ComparatorHabitant());
        for (Ville vil:villes) {

            System.out.println(vil);
        }
    }
}
