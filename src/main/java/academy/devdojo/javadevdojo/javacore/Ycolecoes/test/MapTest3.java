package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest3 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor("William Suane");
        Consumidor consumidor02 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "One Piece", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Hellsing Ultimate", 3.2);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);

        List<Manga> mangaConsumidorList = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor01, mangaConsumidorList);
        consumidorMangaMap.put(consumidor02, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("----" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("--------" + manga.getNome());
            }

        }


    }
}
