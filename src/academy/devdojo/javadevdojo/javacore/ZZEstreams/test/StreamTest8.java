package academy.devdojo.javadevdojo.javacore.ZZEstreams.test;

import academy.devdojo.javadevdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamTest8 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    //SOMA DE TODOS OS "lightNovels" ACIMA DE 3 REAIS DE 2 MANEIRAS
    public static void main(String[] args) {
      lightNovels.stream()
              .map(LightNovel::getPrice)
              .filter(price -> price > 3)
              .reduce(Double::sum)
              .ifPresent(System.out::println);

        System.out.println("----------------------");

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(value -> value > 3)
                .sum();
        System.out.println(sum);
    }
}
