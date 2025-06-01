package academy.devdojo.javadevdojo.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest1 {
    public static void main(String[] args) {
        List<String> strings = List.of("Willian", "Suane", "Luffy", "Zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(strings, s -> System.out.println(s));
        System.out.println("------------");
        forEach(integers, integer -> System.out.println(integer));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
