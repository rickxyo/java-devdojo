package academy.devdojo.javadevdojo.javacore.ZZEstreams.test;

import academy.devdojo.javadevdojo.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javadevdojo.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javadevdojo.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> promotionListMap = new HashMap<>();

        List<LightNovel> underPromotion = new ArrayList<>();
        List<LightNovel> normalPrice = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 6) {
                underPromotion.add(lightNovel);
            } else {
                normalPrice.add(lightNovel);
            }
        }

        promotionListMap.put(Promotion.UNDER_PROMOTION, underPromotion);
        promotionListMap.put(Promotion.NORMAL_PRICE, normalPrice);

        System.out.println(promotionListMap);

        //MESMO RESULTADO QUE O CÓDIGO ACIMA
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));
        System.out.println(collect);

        //AGRUPANDO POR PROMOÇÃO + CATEGORIA
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                )));
        System.out.println(collect1);


    }
}
