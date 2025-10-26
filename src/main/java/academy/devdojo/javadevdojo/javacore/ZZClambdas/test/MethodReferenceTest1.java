package academy.devdojo.javadevdojo.javacore.ZZClambdas.test;

import academy.devdojo.javadevdojo.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javadevdojo.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest1 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 952), new Anime("Naruto", 500)));
//        Collections.sort(animeList, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
//        Collections.sort(animeList, (o1, o2) -> AnimeComparators.compareByTitle(o1, o2));
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);

        System.out.println("--------------");

        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

    }
}
