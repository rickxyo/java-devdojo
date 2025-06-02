package academy.devdojo.javadevdojo.javacore.ZZClambdas.test;

import academy.devdojo.javadevdojo.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Rimuru"));
    }
}
