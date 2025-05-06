package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest1 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("One Piece");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        // DEIXANDO EM ORDEM ALFABETICA
        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }

        System.out.println("--------------------------");

        for (String manga : mangas) {
            System.out.println(manga);
        }

    }
}
