package academy.devdojo.javadevdojo.javacore.ZZClambdas.service;

import academy.devdojo.javadevdojo.javacore.ZZClambdas.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime o1, Anime o2){
        return o1.getTitle().compareTo(o2.getTitle());
    }

    public static int compareByEpisodes(Anime o1, Anime o2){
        return Integer.compare(o1.getEpisodes(), o2.getEpisodes());
    }
}
