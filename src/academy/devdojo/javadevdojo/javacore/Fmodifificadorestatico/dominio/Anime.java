package academy.devdojo.javadevdojo.javacore.Fmodifificadorestatico.dominio;

public class Anime {
    private String name;
    private static int[] episodes;

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode: Anime.episodes){
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}

