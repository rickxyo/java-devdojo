package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest2 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor("William Suane");
        Consumidor consumidor02 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "One Piece", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Hellsing Ultimate", 3.2);
        Manga manga4 = new Manga(3L, "Pokemon", 11.20);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor01, manga1);
        consumidorManga.put(consumidor02, manga4);

        for (Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
