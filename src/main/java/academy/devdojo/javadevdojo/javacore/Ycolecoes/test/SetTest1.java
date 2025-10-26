package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        //"Set" NÃO PERMITE ELEMENTOS DUPLICADOS DENTRO DA COLECAO
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "One Piece", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2, 2));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
