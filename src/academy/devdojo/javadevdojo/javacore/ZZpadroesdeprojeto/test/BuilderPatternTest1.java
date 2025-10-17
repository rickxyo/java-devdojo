package academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.test;

import academy.devdojo.javadevdojo.javacore.ZZpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest1 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .username("viranojiraya")
                .email("william.suane@devdojo.academy")
                .build();
        System.out.println(build);
    }
}
