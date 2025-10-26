package academy.devdojo.javadevdojo.javacore.ZZEstreams.test;

import academy.devdojo.javadevdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest6 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        // EXISTE ALGUMA "lightNovel" COM UM VALOR MAIOR QUE 8? true
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8));

        // TODAS AS "lightNovels" SÃO MAIORES DO QUE 0? true
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));

        // NENHUMA "lightNovel" É MAIOR DO QUE 0? false
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0));

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3) // FILTRAR TODOS COM PRECO ACIMA DE 3
                .findAny()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
