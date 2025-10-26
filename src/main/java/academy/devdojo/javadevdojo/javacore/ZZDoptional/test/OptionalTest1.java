package academy.devdojo.javadevdojo.javacore.ZZDoptional.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest1 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu DevDojo é foda");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-----------");

        Optional<String> nameOptional = Optional.ofNullable(findName("Pedro"));
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static String findName(String name){
        List<String> list = List.of("William", "DevDojo");
        List<String> findName = new ArrayList<>();

        int i = list.indexOf(name);
        if (i != 0){
            return  list.get(i);
        }
        return null;
    }

}
