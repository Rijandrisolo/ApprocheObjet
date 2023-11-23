package arrayList.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> listes = new ArrayList<>();
        for (int j = 1; j<=100;j++){
            listes.add(j);
        }
        // for (int j = 0; j<100;j++){
        System.out.println(listes);

        //}

        System.out.println(listes.size());
    }

}
