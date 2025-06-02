package academy.devdojo.javadevdojo.javacore.ZZClambdas.test;

import academy.devdojo.javadevdojo.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javadevdojo.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest2 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 952), new Anime("Naruto", 500)));
//        animeList.sort((o1, o2) -> animeComparators.compareByEpisodesNonStatic(o1, o2));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

    }
}
