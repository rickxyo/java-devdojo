package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

//IMPRIMINDO DO MENOR PREÇO PARA O MAIOR E INSERINDO NO "TreeSet" NA LINHA 33
class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest1 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "One Piece", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 2));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));

        //METODO ".descendingSet" INVERTE A ORDEM ALFABEBETICA = Z a A
//        for (Manga manga : mangas.descendingSet()) {
//            System.out.println(manga);
//        }

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 8, 5);
        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 3.2, 5);

        //METODOS DE COMPARACAO (para colecoes)
        // lower < retorna o menor
        // floor <= retorna o mesmo elemento que voce esta passando e caso não exista retorna o MENOR
        // higher > retorna o maior
        // ceiling >= retorna o mesmo elemento que voce esta passando e caso não exista retorna o MAIOR

        System.out.println("----------------");
        System.out.println(mangas.lower(yuyu)); // IMPRIME DRAGON BALL Z POIS É O PRIMEIRO VALOR MENOR QUE 3.2 (2.99)
        System.out.println(mangas.floor(yuyu)); // IMPRIME HELLSING ULTIMATE FOI O VALOR É IGUAL
        System.out.println(mangas.higher(yuyu)); // IMPRIME BERSERK POIS É O PRIMEIRO VALOR MAIOR QUE 3.2 (9.5)
        System.out.println(mangas.ceiling(yuyu)); // IMPRIME HELLSING ULTIMATE FOI O VALOR É IGUAL


    }
}
