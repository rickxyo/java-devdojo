package academy.devdojo.javadevdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Pedro");
        nomes.add("Sarah");
        nomes2.add("Mansur");
        nomes2.add("Oldoni");

        nomes.addAll(nomes2); // JUNTA AS 2 LISTAS

        //01 METODDO PARA EXIBIR A LISTA
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("------------");

        //02 METODDO PARA EXIBIR A LISTA
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
