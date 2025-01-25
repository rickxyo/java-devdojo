package academy.devdojo.javadevdojo.javacore.Csobrecargametodos.test;

import academy.devdojo.javadevdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest1 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Acao");
        anime.imprime();
    }
}
