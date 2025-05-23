package academy.devdojo.javadevdojo.javacore.Zgenerics.test;

import academy.devdojo.javadevdojo.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest1 {
    public static void main(String[] args) {
        //Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String o : lista) {
            System.out.println(o);
        }

        add(lista, new Consumidor("Midoriya"));

        for (String o : lista) {
            System.out.println(o);
        }


    }

    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
