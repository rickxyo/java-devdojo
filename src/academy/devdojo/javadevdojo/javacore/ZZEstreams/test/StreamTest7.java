package academy.devdojo.javadevdojo.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest7 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        //somando os números acima de diferentes maneiras = 21
        integers.stream().reduce((x,y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,(x,y) -> x + y));

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println("-------------------");

        //multiplicando os numeros acima = 720
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        System.out.println("-------------------");

        // x é maior que y ou x? retorna y = 6
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
