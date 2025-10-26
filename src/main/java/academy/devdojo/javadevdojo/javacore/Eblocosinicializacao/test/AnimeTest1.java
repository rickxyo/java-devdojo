package academy.devdojo.javadevdojo.javacore.Eblocosinicializacao.test;

import academy.devdojo.javadevdojo.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest1 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
    }
}
