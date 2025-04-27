package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest1 {
    public static void main(String[] args) {
//        String nome = "Pedro";
//        String nome2 = new String ("Pedro");
//        System.out.println(nome.equals(nome2));
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
//        Smartphone s2 = s1;
        System.out.println(s1.equals(s2));

    }
}
