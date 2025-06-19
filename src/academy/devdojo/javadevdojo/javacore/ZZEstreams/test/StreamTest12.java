package academy.devdojo.javadevdojo.javacore.ZZEstreams.test;

import academy.devdojo.javadevdojo.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javadevdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        //"Category" NESTE CONTEXTO SENDO A CHAVE E A LISTA DE "LightNovel" O VALOR
        Map<Category, List<LightNovel>> categoryLightNovelmap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA:
                    drama.add(lightNovel);
                    break;
                case FANTASY:
                    fantasy.add(lightNovel);
                    break;
                case ROMANCE:
                    romance.add(lightNovel);
                    break;
            }
        }
        categoryLightNovelmap.put(Category.DRAMA, drama);
        categoryLightNovelmap.put(Category.FANTASY, fantasy);
        categoryLightNovelmap.put(Category.ROMANCE, romance);
        System.out.println(categoryLightNovelmap);


        //MESMO RESULTADO DO CODIGO ACIMA, APENAS UTILIZANDO O "groupingBy" + STREAMS
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
